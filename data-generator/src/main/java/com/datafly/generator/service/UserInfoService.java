package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.UserInfo;

/**
 * 用户服务类
 */
public interface UserInfoService extends IService<UserInfo> {

    void genUserInfos(Boolean ifClear);

}
