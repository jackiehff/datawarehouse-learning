package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.ActivitySku;
import com.datafly.generator.business.mapper.ActivitySkuMapper;
import com.datafly.generator.business.service.ActivitySkuService;
import org.springframework.stereotype.Service;

/**
 * 活动参与商品服务实现类
 */
@Service
public class ActivitySkuServiceImpl extends ServiceImpl<ActivitySkuMapper, ActivitySku> implements ActivitySkuService {

}
