package com.datafly.generator.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.business.bean.CommentInfo;

/**
 * 商品评论服务类
 */
public interface CommentInfoService extends IService<CommentInfo> {

    void genComments(Boolean ifClear);

}
