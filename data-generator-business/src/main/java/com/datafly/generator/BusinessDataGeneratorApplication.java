package com.datafly.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.datafly.generator.mapper")
public class BusinessDataGeneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BusinessDataGeneratorApplication.class, args);

        MockTask mockTask = context.getBean(MockTask.class);

        mockTask.mainTask();
    }
}
