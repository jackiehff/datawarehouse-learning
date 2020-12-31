package com.datafly.generator.util;

import org.apache.commons.io.IOUtils;
import org.springframework.boot.system.ApplicationHome;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConfigUtil {

    public static String loadJsonFile(String fileName) {
        String filePath = getJarDir() + "/" + fileName;
        File file = new File(filePath);
        InputStream resourceAsStream;
        try {
            if (file.exists()) {
                resourceAsStream = new FileInputStream(file);
            } else {
                resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            }
            return IOUtils.toString(resourceAsStream, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("配置文件" + fileName + "读取异常");
        }
    }

    public static String getJarDir() {
        File file = getJarFile();
        return file.getParent();
    }

    private static File getJarFile() {
        ApplicationHome h = new ApplicationHome(ConfigUtil.class);
        File jarF = h.getSource();
        System.out.println(jarF.getParentFile().toString());
        return jarF;
    }
}
