package com.jay.springspi.logger;

import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class SpringSpi {
    public static void main(String[] args) {
        List<LoggerForSpringSpi> loggerForSpringSpis = SpringFactoriesLoader.loadFactories(LoggerForSpringSpi.class, Thread.currentThread().getContextClassLoader());
        loggerForSpringSpis.forEach(logger -> System.out.println(logger.log("hello ")));

    }
}
