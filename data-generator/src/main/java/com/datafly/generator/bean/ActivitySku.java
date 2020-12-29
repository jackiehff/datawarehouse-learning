package com.datafly.generator.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 活动参与商品
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
@Data
public class ActivitySku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 创建时间
     */
    private Date createTime;
}
