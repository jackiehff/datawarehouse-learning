package com.datafly.mock.log;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LogDataGeneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LogDataGeneratorApplication.class, args);
        MockTask mockTask = context.getBean(MockTask.class);
        mockTask.mainTask();
    }
}
