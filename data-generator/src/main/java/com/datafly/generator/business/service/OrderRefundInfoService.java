package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.OrderRefundInfo;

/**
 * 退单服务类
 */
public interface OrderRefundInfoService extends IService<OrderRefundInfo> {

    void genRefundsOrFinish(Boolean ifClear);
}
