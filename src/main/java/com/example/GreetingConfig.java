package com.example;


import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.ConfigurationProperties;

//See how you are mapping the application.yml config properties to be picked from here
@ConfigurationProperties("hello.config.greeting")
public class GreetingConfig {

    private final String de;
    private final String en;


    @ConfigurationInject
    public GreetingConfig(String de, String en) {
        this.de = de;
        this.en = en;
    }

    public String getDe() {
        return de;
    }

    public String getEn() {
        return en;
    }
}
