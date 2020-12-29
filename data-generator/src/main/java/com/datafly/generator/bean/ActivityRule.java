package com.datafly.generator.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 优惠规则
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
@Data
public class ActivityRule implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 类型
     */
    private Integer activityId;

    /**
     * 满减金额
     */
    private BigDecimal conditionAmount;

    /**
     * 满减件数
     */
    private Long conditionNum;

    /**
     * 优惠金额
     */
    private BigDecimal benefitAmount;

    /**
     * 优惠折扣
     */
    private Long benefitDiscount;

    /**
     * 优惠级别
     */
    private Long benefitLevel;

    @Override
    public String toString() {
        return "ActivityRule{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", conditionAmount=" + conditionAmount +
                ", conditionNum=" + conditionNum +
                ", benefitAmount=" + benefitAmount +
                ", benefitDiscount=" + benefitDiscount +
                ", benefitLevel=" + benefitLevel +
                "}";
    }
}
