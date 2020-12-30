package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.PaymentInfo;

/**
 * 支付流水服务类
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    public void genPayments(Boolean ifClear);
}
