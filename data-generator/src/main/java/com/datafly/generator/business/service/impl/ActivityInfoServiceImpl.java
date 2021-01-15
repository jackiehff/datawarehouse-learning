package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.ActivityInfo;
import com.datafly.generator.business.mapper.ActivityInfoMapper;
import com.datafly.generator.business.service.ActivityInfoService;
import org.springframework.stereotype.Service;

/**
 * 活动服务实现类
 */
@Service
public class ActivityInfoServiceImpl extends ServiceImpl<ActivityInfoMapper, ActivityInfo> implements ActivityInfoService {
}
