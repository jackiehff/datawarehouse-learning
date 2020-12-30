package com.datafly.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datafly.generator.bean.FavorInfo;
import com.datafly.generator.mapper.FavorInfoMapper;
import com.datafly.generator.mapper.SkuInfoMapper;
import com.datafly.generator.mapper.UserInfoMapper;
import com.datafly.generator.service.FavorInfoService;
import com.datafly.generator.util.ParamUtil;
import com.datafly.generator.util.RanOpt;
import com.datafly.generator.util.RandomNum;
import com.datafly.generator.util.RandomOptionGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品收藏服务实现类
 */
@Service
@Slf4j
public class FavorInfoServiceImpl extends ServiceImpl<FavorInfoMapper, FavorInfo> implements FavorInfoService {

    @Autowired
    SkuInfoMapper skuInfoMapper;

    @Autowired
    UserInfoMapper userInfoMapper;


    @Value("${mock.date}")
    String mockDate;

    @Value("${mock.favor.count}")
    String countString;

    @Value("${mock.favor.cancel-rate:50}")
    String cancelRate;

    @Override
    public void genFavors(Boolean ifClear) {
        Integer count = ParamUtil.checkCount(countString);

        if (ifClear) {
            remove(new QueryWrapper<>());
        }
        Integer skuTotal = skuInfoMapper.selectCount(new QueryWrapper<>());
        Integer userTotal = userInfoMapper.selectCount(new QueryWrapper<>());

        List<FavorInfo> favorInfoList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Long userId = RandomNum.getRandInt(1, userTotal) + 0L;
            Long skuId = RandomNum.getRandInt(1, skuTotal) + 0L;
            favorInfoList.add(initFavorInfo(skuId, userId));
        }
        saveBatch(favorInfoList, 100);
        log.warn("共生成收藏" + favorInfoList.size() + "条");
    }


    public FavorInfo initFavorInfo(Long skuId, Long userId) {

        Date date = ParamUtil.checkDate(mockDate);
        Integer cancelRateWeight = ParamUtil.checkRatioNum(this.cancelRate);

        RandomOptionGroup<String> isCancelOptionGroup = new RandomOptionGroup(new RanOpt("1", cancelRateWeight), new RanOpt("0", 100 - cancelRateWeight));

        FavorInfo favorInfo = new FavorInfo();
        favorInfo.setSkuId(skuId);
        String isCancel = isCancelOptionGroup.getRandStringValue();
        favorInfo.setIsCancel(isCancel);
        favorInfo.setUserId(userId);
        favorInfo.setCreateTime(date);
        if ("1".equals(isCancel)) {
            favorInfo.setCancelTime(date);
        }
        return favorInfo;
    }
}
