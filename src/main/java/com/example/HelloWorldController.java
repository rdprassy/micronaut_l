package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hello")
public class HelloWorldController {



    // constructor based service
    @Inject
    private HelloWorldService service;

//     constructor based injection highly recommened during production
//    public HelloWorldController(final HelloWorldService service) {
//        this.service = service;
//    }

    @Get("/")
        public String index(){
           return service.sayHi();


//        return "Hello World";
        }

}
