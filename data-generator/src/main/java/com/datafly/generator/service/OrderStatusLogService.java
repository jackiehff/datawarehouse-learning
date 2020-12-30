package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.OrderInfo;
import com.datafly.generator.bean.OrderStatusLog;

import java.util.List;

/**
 * 订单状态日志服务类
 */
public interface OrderStatusLogService extends IService<OrderStatusLog> {
    void genOrderStatusLog(List<OrderInfo> orderInfoList);
}
