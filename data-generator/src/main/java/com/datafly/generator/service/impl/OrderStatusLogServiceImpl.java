package com.datafly.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.bean.OrderInfo;
import com.datafly.generator.bean.OrderStatusLog;
import com.datafly.generator.mapper.OrderStatusLogMapper;
import com.datafly.generator.service.OrderStatusLogService;
import com.datafly.generator.util.ParamUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zc
 * @since 2020-02-24
 */
@Service
public class OrderStatusLogServiceImpl extends ServiceImpl<OrderStatusLogMapper, OrderStatusLog> implements OrderStatusLogService {


    @Value("${mock.date}")
    String mockDate;


    @Override
    public void genOrderStatusLog(List<OrderInfo> orderInfoList) {
        Date date = ParamUtil.checkDate(mockDate);

        List<OrderStatusLog> orderStatusLogList = new ArrayList<>();
        for (OrderInfo orderInfo : orderInfoList) {
            OrderStatusLog orderStatusLog = new OrderStatusLog();
            orderStatusLog.setOperateTime(date);
            orderStatusLog.setOrderStatus(orderInfo.getOrderStatus());
            orderStatusLog.setOrderId(orderInfo.getId());
            orderStatusLogList.add(orderStatusLog);
        }
        saveBatch(orderStatusLogList);

    }
}
