package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.OrderInfo;
import com.datafly.generator.business.bean.OrderStatusLog;

import java.util.List;

/**
 * 订单状态日志服务类
 */
public interface OrderStatusLogService extends IService<OrderStatusLog> {
    void genOrderStatusLog(List<OrderInfo> orderInfoList);
}
