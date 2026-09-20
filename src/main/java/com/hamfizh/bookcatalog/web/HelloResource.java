package com.hamfizh.bookcatalog.web;

import com.hamfizh.bookcatalog.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloResource {

    Logger logger = LoggerFactory.getLogger(HelloResource.class);

    private final GreetingService greetingService;

//    @Autowired
//    public HelloResource(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    @GetMapping("/hello")
    public String helloWorld(){
        logger.error("Hello World!");
        logger.info("Hello World!");
        logger.warn("Hello World!");
        logger.debug("Heloo Word");
        return greetingService.sayGreeing();
    }
}
