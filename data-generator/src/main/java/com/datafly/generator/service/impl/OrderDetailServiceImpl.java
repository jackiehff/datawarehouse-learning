package com.datafly.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.bean.OrderDetail;
import com.datafly.generator.mapper.OrderDetailMapper;
import com.datafly.generator.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * 订单明细服务实现类
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
