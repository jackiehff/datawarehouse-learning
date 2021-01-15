package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.SpuInfo;
import com.datafly.generator.business.mapper.SpuInfoMapper;
import com.datafly.generator.business.service.SpuInfoService;
import org.springframework.stereotype.Service;

/**
 * 商品服务实现类
 */
@Service
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements SpuInfoService {
}
