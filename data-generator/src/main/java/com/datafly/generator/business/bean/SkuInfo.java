package com.datafly.generator.business.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 库存单元表
 */
@Data
public class SkuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * skuid(itemID)
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * spuid
     */
    private Long spuId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 商品规格描述
     */
    private String skuDesc;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 品牌(冗余)
     */
    private Long tmId;

    /**
     * 三级分类id（冗余)
     */
    private Long category3Id;

    /**
     * 默认显示图片(冗余)
     */
    private String skuDefaultImg;

    /**
     * 创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "SkuInfo{" +
                "id=" + id +
                ", spuId=" + spuId +
                ", price=" + price +
                ", skuName=" + skuName +
                ", skuDesc=" + skuDesc +
                ", weight=" + weight +
                ", tmId=" + tmId +
                ", category3Id=" + category3Id +
                ", skuDefaultImg=" + skuDefaultImg +
                ", createTime=" + createTime +
                "}";
    }
}
