package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.FavorInfo;

/**
 * 商品收藏服务类
 */
public interface FavorInfoService extends IService<FavorInfo> {
    void genFavors(Boolean ifClear);
}
