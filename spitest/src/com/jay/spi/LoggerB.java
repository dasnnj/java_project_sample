package com.jay.spi;

import com.jay.base.LoggerForSpiTest;

public class LoggerB implements LoggerForSpiTest {
    @Override
    public String log(String msg) {
        return msg + "i am LoggerB";
    }
}
