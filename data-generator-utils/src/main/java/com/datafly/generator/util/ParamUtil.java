package com.datafly.generator.util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class ParamUtil {

    public static Integer checkRatioNum(String rate) {
        try {
            int rateNum = Integer.parseInt(rate);
            if (rateNum < 0 || rateNum > 100) {
                throw new RuntimeException("输入的比率必须为0 - 100 的数字");
            }
            return rateNum;
        } catch (Exception e) {
            throw new RuntimeException("输入的比率必须为0 - 100 的数字");
        }
    }

    public static Date checkDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            String timeString = timeFormat.format(new Date());
            String datetimeString = dateString + " " + timeString;
            return datetimeFormat.parse(datetimeString);
        } catch (ParseException e) {
            throw new RuntimeException("必须为日期型格式 例如： 2020-02-02");
        }
    }

    public static Boolean checkBoolean(String bool) {
        if ("1".equals(bool) || "true".equals(bool)) {
            return true;
        } else if ("0".equals(bool) || "false".equals(bool)) {
            return false;
        } else {
            throw new RuntimeException("是非型参数请填写：1或0 ， true 或 false");
        }
    }

    public static Integer[] checkRate(String rateString, int rateCount) {
        try {
            String[] rateArray = rateString.split(":");
            if (rateArray.length != rateCount) {
                throw new RuntimeException("请按比例个数不足 ");
            }
            Integer[] rateNumArr = new Integer[rateArray.length];
            for (int i = 0; i < rateArray.length; i++) {
                Integer rate = checkRatioNum(rateArray[i]);
                rateNumArr[i] = rate;
            }
            return rateNumArr;
        } catch (Exception e) {
            throw new RuntimeException("请按比例填写 如   75:10:15");
        }
    }


    public static Integer checkCount(String count) {
        try {
            if (count == null) {
                return 0;
            }
            return Integer.valueOf(count);
        } catch (Exception e) {
            throw new RuntimeException("输入的数据必须为数字");
        }
    }

    public static void main(String[] args) {
        System.out.println(ParamUtil.checkDate("2019-13-1123"));
        System.out.println("ok");
    }
}
