package com.jay.springspi.logger;


public class LoggerC implements LoggerForSpringSpi {
    @Override
    public String log(String msg) {
        return msg+"i am LoggerC";
    }
}
