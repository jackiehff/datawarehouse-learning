package com.datafly.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.bean.ActivityInfo;
import com.datafly.generator.mapper.ActivityInfoMapper;
import com.datafly.generator.service.ActivityInfoService;
import org.springframework.stereotype.Service;

/**
 * 活动服务实现类
 */
@Service
public class ActivityInfoServiceImpl extends ServiceImpl<ActivityInfoMapper, ActivityInfo> implements ActivityInfoService {
}
