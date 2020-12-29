package com.datafly.generator.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 活动与订单关联表
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
@Data
@AllArgsConstructor
public class ActivityOrder implements Serializable {

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
     * 订单编号
     */
    private Long orderId;


    @TableField(exist = false)
    private OrderInfo orderInfo;
    /**
     * 发生日期
     */
    private Date createTime;

    @Override
    public String toString() {
        return "ActivityOrder{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", orderId=" + orderId +
                ", createTime=" + createTime +
                "}";
    }
}
