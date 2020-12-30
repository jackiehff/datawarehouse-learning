package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.OrderRefundInfo;

/**
 * <p>
 * 退单表 服务类
 * </p>
 */
public interface OrderRefundInfoService extends IService<OrderRefundInfo> {

    public void genRefundsOrFinish(Boolean ifClear);
}
