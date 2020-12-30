package com.datafly.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datafly.generator.bean.CommentInfo;

/**
 * <p>
 * 商品评论表 服务类
 * </p>
 */
public interface CommentInfoService extends IService<CommentInfo> {

    public void genComments(Boolean ifClear);

}
