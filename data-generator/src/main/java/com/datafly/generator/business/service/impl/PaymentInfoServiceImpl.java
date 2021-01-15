package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.OrderInfo;
import com.datafly.generator.business.bean.PaymentInfo;
import com.datafly.generator.business.mapper.PaymentInfoMapper;
import com.datafly.generator.business.service.CouponUseService;
import com.datafly.generator.business.service.OrderInfoService;
import com.datafly.generator.business.service.OrderStatusLogService;
import com.datafly.generator.business.service.PaymentInfoService;
import com.datafly.generator.common.constant.GmallConstant;
import com.datafly.generator.common.util.ParamUtil;
import com.datafly.generator.common.util.RanOpt;
import com.datafly.generator.common.util.RandomNumString;
import com.datafly.generator.common.util.RandomOptionGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.datafly.generator.common.constant.GmallConstant.*;

/**
 * 支付流水服务实现类
 */
@Service
@Slf4j
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

    @Autowired
    OrderInfoService orderInfoService;

    @Autowired
    OrderStatusLogService orderStatusLogService;

    @Autowired
    CouponUseService couponUseService;


    @Value("${mock.date}")
    String mockDate;

    @Value("${mock.payment.rate:70}")
    String ifPaymentRate;

    @Value("${mock.payment.payment-type:30:60:10}")
    String paymentTypeRate;


    @Override
    public void genPayments(Boolean ifClear) {
        Date date = ParamUtil.checkDate(mockDate);
        int ifPaymentWeight = ParamUtil.checkRatioNum(this.ifPaymentRate);
        Integer[] paymentTypeRateWeight = ParamUtil.checkRate(this.paymentTypeRate, 3);

        RandomOptionGroup<Boolean> ifPayment = new RandomOptionGroup(new RanOpt(true, ifPaymentWeight), new RanOpt(false, 100 - ifPaymentWeight));
        RandomOptionGroup<String> paymentOptionGroup = new RandomOptionGroup(new RanOpt(PAYMENT_TYPE_ALIPAY, paymentTypeRateWeight[0]), new RanOpt(PAYMENT_TYPE_WECHAT, paymentTypeRateWeight[1]), new RanOpt(PAYMENT_TYPE_UNION, paymentTypeRateWeight[2]));

        if (ifClear) {
            remove(new QueryWrapper<>());
        }

        QueryWrapper<OrderInfo> orderInfoQueryWrapper = new QueryWrapper<>();
        orderInfoQueryWrapper.eq("order_status", GmallConstant.ORDER_STATUS_UNPAID);
        orderInfoQueryWrapper.orderByAsc("id");
        List<OrderInfo> orderInfoList = orderInfoService.listWithDetail(orderInfoQueryWrapper);
        List<PaymentInfo> paymentList = new ArrayList<>();

        if (orderInfoList.size() == 0) {
            System.out.println("没有需要支付的订单！！ ");
            return;
        }
        for (OrderInfo orderInfo : orderInfoList) {
            if (ifPayment.getRandBoolValue()) {
                PaymentInfo paymentInfo = new PaymentInfo();
                paymentInfo.setOrderId(orderInfo.getId());
                paymentInfo.setTotalAmount(orderInfo.getFinalTotalAmount());
                paymentInfo.setUserId(orderInfo.getUserId());
                paymentInfo.setOutTradeNo(orderInfo.getOutTradeNo());
                paymentInfo.setAlipayTradeNo(RandomNumString.getRandNumString(1, 9, 34, ""));
                paymentInfo.setPaymentType(paymentOptionGroup.getRandStringValue());
                paymentInfo.setSubject(orderInfo.getTradeBody());
                paymentInfo.setPaymentTime(date);
                paymentList.add(paymentInfo);

                orderInfo.setOrderStatus(GmallConstant.ORDER_STATUS_PAID);
            }
        }

        couponUseService.usedCoupon(orderInfoList);

        orderInfoService.updateOrderStatus(orderInfoList);
        log.warn("共有" + paymentList.size() + "订单完成支付");
        saveBatch(paymentList, 100);
    }
}
