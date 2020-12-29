package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.ActivityOrder;
import com.datafly.generator.bean.OrderInfo;

import java.util.List;

/**
 * <p>
 * 活动与订单关联表 服务类
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
public interface ActivityOrderService extends IService<ActivityOrder> {

    public List<ActivityOrder> genActivityOrder(List<OrderInfo> orderInfoList, Boolean ifClear);

    public void saveActivityOrderList(List<ActivityOrder> activityOrderList);

}
