package com.jay.base;

import java.util.ServiceLoader;

public class JdkSpi {
    public static void main(String[] args) {
        ServiceLoader<LoggerForSpiTest> spiTests = ServiceLoader.load(LoggerForSpiTest.class);
        spiTests.forEach( logger -> System.out.println(logger.log("hello ")));
    }
}
