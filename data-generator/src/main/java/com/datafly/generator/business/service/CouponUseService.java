package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.CouponUse;
import com.datafly.generator.business.bean.OrderInfo;

import java.util.List;

/**
 * <p>
 * 优惠券领用表 服务类
 * </p>
 */
public interface CouponUseService extends IService<CouponUse> {

    void genCoupon(Boolean ifClear);

    void usedCoupon(List<OrderInfo> orderInfoList);

    List<CouponUse> usingCoupon(List<OrderInfo> orderInfoList);

    void saveCouponUseList(List<CouponUse> couponUseList);


}
