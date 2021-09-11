package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

//@Controller("/hello")
@Controller("${hello.controller.path:/hello}")
public class HelloWorldController {



    // constructor based service
//    @Inject
    private final HelloWorldService service;
    private final GreetingConfig config;

    public HelloWorldController(HelloWorldService service, GreetingConfig config) {
        this.service = service;
        this.config = config;
    }
    //     constructor based injection highly recommened during production
//    public HelloWorldController(final HelloWorldService service) {
//        this.service = service;
//    }

    @Get("/")
        public String index(){
           return service.sayHi();


//        return "Hello World";
        }


        @Get("/de")
    public String greetInGerman(){
        return config.getDe();
        }

    @Get("/en")
    public String greetInEnglish(){
        return config.getEn();
    }

}
