package com.example;


import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {



//    @Value("Hello from service")
//    @Value("${hello.service.greeting}")
    @Property(name= "hello.service.greeting", defaultValue = "default value")
    private String greeting;

    public String sayHi(){
//        return "Hello from service";
        return greeting;
    }
}
