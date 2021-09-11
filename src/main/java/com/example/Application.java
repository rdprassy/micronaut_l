package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {


    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        final ApplicationContext context = Micronaut.run(Application.class);
        final HelloWorldService service = context.getBean(HelloWorldService.class);
        System.out.println(service.sayHi());
        LOG.info(service.sayHi());
//        context.close();


//        Micronaut.run(Application.class, args);
    }
}
