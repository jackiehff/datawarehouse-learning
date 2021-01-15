package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.PaymentInfo;

/**
 * 支付流水服务类
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    public void genPayments(Boolean ifClear);
}
