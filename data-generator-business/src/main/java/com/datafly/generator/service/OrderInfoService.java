package com.datafly.generator.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.OrderInfo;

import java.util.List;

/**
 * 订单服务类
 */
public interface OrderInfoService extends IService<OrderInfo> {

    void genOrderInfos(boolean ifClear);

    void updateOrderStatus(List<OrderInfo> orderInfoList);

    List<OrderInfo> listWithDetail(Wrapper<OrderInfo> queryWrapper);

    List<OrderInfo> listWithDetail(Wrapper<OrderInfo> queryWrapper, Boolean withSkuInfo);
}
