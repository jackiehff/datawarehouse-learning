package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.FavorInfo;

/**
 * 商品收藏服务类
 */
public interface FavorInfoService extends IService<FavorInfo> {
    void genFavors(Boolean ifClear);
}
