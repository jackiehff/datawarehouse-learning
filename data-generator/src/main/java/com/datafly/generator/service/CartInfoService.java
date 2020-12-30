package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.CartInfo;

/**
 * 购物车表 用户登录系统时更新冗余 服务类
 */
public interface CartInfoService extends IService<CartInfo> {

    void genCartInfo(boolean ifClear);

}
