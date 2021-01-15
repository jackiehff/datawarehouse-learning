package com.datafly.generator.behaviorlog.bean;

import com.datafly.generator.behaviorlog.config.AppConfig;
import com.datafly.generator.common.util.RanOpt;
import com.datafly.generator.common.util.RandomNum;
import com.datafly.generator.common.util.RandomOptionGroup;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(builderClassName = "Builder")
public class AppCommon {

    /**
     * 设备唯一标识
     */
    private String mid;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * versionCode 程序版本号
     */
    private String vc;

    /**
     * 渠道号，应用从哪个渠道来的
     */
    private String ch;

    /**
     * 系统版本
     */
    private String os;

    /**
     * 区域
     */
    private String ar;

    /**
     * 手机型号
     */
    private String md;

    /**
     * 手机品牌
     */
    private String ba;

    public static AppCommon build() {
        String mid;
        String uid;
        String vc;
        String ch;
        String os;
        String ar;
        String md;
        String ba;

        mid = "mid_" + RandomNum.getRandInt(1, AppConfig.max_mid) + "";
        ar = new RandomOptionGroup<>(new RanOpt<>("110000", 30),
                new RanOpt<>("310000", 20),
                new RanOpt<>("230000", 10),
                new RanOpt<>("370000", 10),
                new RanOpt<>("420000", 5),
                new RanOpt<>("440000", 20),
                new RanOpt<>("500000", 5),
                new RanOpt<>("530000", 5)
        ).getRandStringValue();

        md = new RandomOptionGroup<>(new RanOpt<>("Xiaomi 9", 30),
                new RanOpt<>("Xiaomi 10 Pro ", 30),
                new RanOpt<>("Xiaomi Mix2 ", 30),
                new RanOpt<>("iPhone X", 20),
                new RanOpt<>("iPhone 8", 20),
                new RanOpt<>("iPhone Xs", 20),
                new RanOpt<>("iPhone Xs Max", 20),
                new RanOpt<>("Huawei P30", 10),
                new RanOpt<>("Huawei Mate 30", 10),
                new RanOpt<>("Redmi k30", 10),
                new RanOpt<>("Honor 20s", 5),
                new RanOpt<>("vivo iqoo3", 20),
                new RanOpt<>("Oneplus 7", 5),
                new RanOpt<>("Sumsung Galaxy S20", 3)).getRandStringValue();

        ba = md.split(" ")[0];

        if (ba.equals("iPhone")) {
            ch = "Appstore";
            os = "iOS " + new RandomOptionGroup<>(new RanOpt<>("13.3.1", 30),
                    new RanOpt<>("13.2.9", 10),
                    new RanOpt<>("13.2.3", 10),
                    new RanOpt<>("12.4.1", 5)
            ).getRandStringValue();

        } else {
            ch = new RandomOptionGroup<>(new RanOpt<>("xiaomi", 30),
                    new RanOpt<>("wandoujia", 10),
                    new RanOpt<>("web", 10),
                    new RanOpt<>("huawei", 5),
                    new RanOpt<>("oppo", 20),
                    new RanOpt<>("vivo", 5),
                    new RanOpt<>("360", 5)
            ).getRandStringValue();
            os = "Android " + new RandomOptionGroup<>(new RanOpt<>("11.0", 70),
                    new RanOpt<>("10.0", 20),
                    new RanOpt<>("9.0", 5),
                    new RanOpt<>("8.1", 5)
            ).getRandStringValue();
        }

        vc = "v" + new RandomOptionGroup<>(new RanOpt<>("2.1.134", 70),
                new RanOpt<>("2.1.132", 20),
                new RanOpt<>("2.1.111", 5),
                new RanOpt<>("2.0.1", 5)
        ).getRandStringValue();

        uid = RandomNum.getRandInt(1, AppConfig.max_uid) + "";

        return new AppCommon(mid, uid, vc, ch, os, ar, md, ba);
    }
}
