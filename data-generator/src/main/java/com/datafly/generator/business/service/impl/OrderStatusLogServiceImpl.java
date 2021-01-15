package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.OrderInfo;
import com.datafly.generator.business.bean.OrderStatusLog;
import com.datafly.generator.business.mapper.OrderStatusLogMapper;
import com.datafly.generator.business.service.OrderStatusLogService;
import com.datafly.generator.common.util.ParamUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单状态日志服务实现类
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
