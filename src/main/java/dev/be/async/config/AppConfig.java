package dev.be.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


@Configuration
public class AppConfig {

    @Bean(name = "defaultTaskExucuter")
    public ThreadPoolTaskExecutor defaultThreadPoolExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(200);
        taskExecutor.setMaxPoolSize(300);
        return taskExecutor;
    }
    @Bean(name = "messageTaskExucuter")
    public ThreadPoolTaskExecutor messageThreadPoolExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(200);
        taskExecutor.setMaxPoolSize(300);
        return taskExecutor;
    }
}
