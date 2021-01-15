package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.CouponInfo;
import com.datafly.generator.business.mapper.CouponInfoMapper;
import com.datafly.generator.business.service.CouponInfoService;
import org.springframework.stereotype.Service;

/**
 * 优惠券服务实现类
 */
@Service
public class CouponInfoServiceImpl extends ServiceImpl<CouponInfoMapper, CouponInfo> implements CouponInfoService {
}
