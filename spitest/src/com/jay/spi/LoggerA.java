package com.jay.spi;

import com.jay.base.LoggerForSpiTest;

public class LoggerA implements LoggerForSpiTest {
    @Override
    public String log(String msg) {
        return msg + "i am LoggerA";
    }
}
