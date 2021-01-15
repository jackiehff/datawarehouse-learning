package com.datafly.generator;

import com.datafly.generator.behaviorlog.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;


@Component
public class BehaviorLogMockTask {

    @Autowired
    ThreadPoolTaskExecutor poolExecutor;

    public void mainTask() {

        for (int i = 0; i < AppConfig.mock_count; i++) {
            System.out.println("active+" + poolExecutor.getActiveCount());
            new Mocker().run();
        }
    }
}
