package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.OrderInfo;
import com.datafly.generator.bean.OrderStatusLog;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface OrderStatusLogService extends IService<OrderStatusLog> {
    public void genOrderStatusLog(List<OrderInfo> orderInfoList);

}
