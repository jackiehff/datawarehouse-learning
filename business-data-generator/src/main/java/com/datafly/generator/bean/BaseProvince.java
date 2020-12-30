package com.datafly.generator.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseProvince implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 省名称
     */
    private String name;

    /**
     * 大区id
     */
    private String regionId;

    /**
     * 行政区位码
     */
    private String areaCode;

    /**
     * 国际编码
     */
    private String isoCode;

    @Override
    public String toString() {
        return "BaseProvince{" +
                "id=" + id +
                ", name=" + name +
                ", regionId=" + regionId +
                ", areaCode=" + areaCode +
                ", isoCode=" + isoCode +
                "}";
    }
}
