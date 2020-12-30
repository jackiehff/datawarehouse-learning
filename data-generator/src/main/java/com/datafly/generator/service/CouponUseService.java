package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.CouponUse;
import com.datafly.generator.bean.OrderInfo;

import java.util.List;

/**
 * <p>
 * 优惠券领用表 服务类
 * </p>
 */
public interface CouponUseService extends IService<CouponUse> {

    public void genCoupon(Boolean ifClear);

    public void usedCoupon(List<OrderInfo> orderInfoList);

    public List<CouponUse> usingCoupon(List<OrderInfo> orderInfoList);

    public void saveCouponUseList(List<CouponUse> couponUseList);


}
