package com.roager.firstrestapi.helloworld;

import org.springframework.context.annotation.Bean;

public class HelloWolrdBean {
    private String message;

    public HelloWolrdBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean [message=" + message + "]";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
