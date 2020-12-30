package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.PaymentInfo;

/**
 * <p>
 * 支付流水表 服务类
 * </p>
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    public void genPayments(Boolean ifClear);
}
