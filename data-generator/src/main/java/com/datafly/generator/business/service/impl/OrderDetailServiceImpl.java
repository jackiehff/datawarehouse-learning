package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.OrderDetail;
import com.datafly.generator.business.mapper.OrderDetailMapper;
import com.datafly.generator.business.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * 订单明细服务实现类
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
