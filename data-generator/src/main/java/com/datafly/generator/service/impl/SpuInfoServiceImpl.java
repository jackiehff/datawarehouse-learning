package com.datafly.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.bean.SpuInfo;
import com.datafly.generator.mapper.SpuInfoMapper;
import com.datafly.generator.service.SpuInfoService;
import org.springframework.stereotype.Service;

/**
 * 商品服务实现类
 */
@Service
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements SpuInfoService {
}
