package com.datafly.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datafly.generator.bean.UserInfo;
import org.apache.ibatis.annotations.Update;

/**
 * 用户 Mapper 接口
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Update("truncate table user_info")
    void truncateUserInfo();
}
