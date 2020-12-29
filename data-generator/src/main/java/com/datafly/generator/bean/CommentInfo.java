package com.datafly.generator.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品评论表
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-24
 */
@Data
public class CommentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名称
     */
    private Long userId;

    /**
     * skuid
     */
    private Long skuId;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 评价 1 好评 2 中评 3 差评
     */
    private String appraise;

    /**
     * 评价内容
     */
    private String commentTxt;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date operateTime;

    @Override
    public String toString() {
        return "CommentInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", skuId=" + skuId +
                ", spuId=" + spuId +
                ", orderId=" + orderId +
                ", appraise=" + appraise +
                ", commentTxt=" + commentTxt +
                ", createTime=" + createTime +
                ", operateTime=" + operateTime +
                "}";
    }
}
