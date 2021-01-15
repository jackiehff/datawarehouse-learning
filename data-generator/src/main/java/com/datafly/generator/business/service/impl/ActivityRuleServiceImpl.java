package com.datafly.generator.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.business.bean.ActivityRule;
import com.datafly.generator.business.mapper.ActivityRuleMapper;
import com.datafly.generator.business.service.ActivityRuleService;
import org.springframework.stereotype.Service;

/**
 * 活动规则服务实现类
 */
@Service
public class ActivityRuleServiceImpl extends ServiceImpl<ActivityRuleMapper, ActivityRule> implements ActivityRuleService {
}
