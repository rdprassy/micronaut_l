package com.example;


import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;

//See how you are mapping the application.yml config properties to be picked from here
@ConfigurationProperties("hello.config.greeting")
public class GreetingConfig {

    @Getter
    private final String de;

    @Getter
    private final String en;


    @ConfigurationInject
    public GreetingConfig(String de, String en) {
        this.de = de;
        this.en = en;
    }

//    public String getDe() {
//        return de;
//    }
//
//    public String getEn() {
//        return en;
//    }
}
