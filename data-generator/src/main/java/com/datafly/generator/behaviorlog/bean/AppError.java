package com.datafly.generator.behaviorlog.bean;

import com.datafly.generator.common.util.RandomNum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppError {

    Integer error_code;

    String msg;

    public static AppError build() {
        int errorCode = RandomNum.getRandInt(1001, 4001);
        String msg = " Exception in thread \\  java.net.SocketTimeoutException\\n \\tat com.datafly.generator.behaviorlog.bean.AppError.main(AppError.java:xxxxxx)";
        return new AppError(errorCode, msg);
    }
}
