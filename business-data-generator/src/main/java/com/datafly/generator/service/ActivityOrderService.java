package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.ActivityOrder;
import com.datafly.generator.bean.OrderInfo;

import java.util.List;

/**
 * 活动与订单关联服务类
 */
public interface ActivityOrderService extends IService<ActivityOrder> {

    List<ActivityOrder> genActivityOrder(List<OrderInfo> orderInfoList, Boolean ifClear);

    void saveActivityOrderList(List<ActivityOrder> activityOrderList);

}
