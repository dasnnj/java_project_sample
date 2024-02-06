package com.jay.springspi.logger;


public class LoggerD implements LoggerForSpringSpi {
    @Override
    public String log(String msg) {
        return msg+"i am LoggerD";
    }
}
