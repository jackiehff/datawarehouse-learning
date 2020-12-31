package com.datafly.mock.log.bean;

import com.datafly.generator.util.RanOpt;
import com.datafly.generator.util.RandomNum;
import com.datafly.generator.util.RandomOptionGroup;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppStart {

    /**
     * 入口： 安装后进入=install，  点击图标= icon，  点击通知= notice
     */
    private String entry;

    /**
     * 开屏广告Id
     */
    private Long open_ad_id;

    /**
     * 开屏广告持续时间
     */
    private Integer open_ad_ms;

    /**
     * 开屏广告点击掉过的时间  未点击为0
     */
    private Integer open_ad_skip_ms;

    /**
     * 加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间）
     */
    private Integer loading_time;

    public static class Builder {
        private String entry;
        private Long open_ad_id;
        private Integer open_ad_ms;
        private Integer open_ad_skip_ms;
        private Integer loading_time;

        public Builder() {
            entry = new RandomOptionGroup<>(new RanOpt<>("install", 5),
                    new RanOpt<>("icon", 75),
                    new RanOpt<>("notice", 20)).getRandStringValue();
            open_ad_id = RandomNum.getRandInt(1, 20) + 0L;
            open_ad_ms = RandomNum.getRandInt(1000, 10000);
            open_ad_skip_ms = RandomOptionGroup.builder().add(0, 50).add(RandomNum.getRandInt(1000, open_ad_ms), 50).build().getRandIntValue();
            loading_time = RandomNum.getRandInt(1000, 20000);
        }

        public AppStart build() {
            return new AppStart(entry, open_ad_id, open_ad_ms, open_ad_skip_ms, loading_time);
        }
    }
}
