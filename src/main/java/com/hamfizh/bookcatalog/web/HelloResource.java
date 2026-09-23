package com.hamfizh.bookcatalog.web;

import com.hamfizh.bookcatalog.service.GreetingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HelloResource {

//    Log Log = LogFactory.getLog(HelloResource.class);

    private final GreetingService greetingService;

//    @Autowired
//    public HelloResource(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    @GetMapping("/hello")
    public String helloWorld(){
        log.error("Hello World!");
        log.info("Hello World!");
        log.warn("Hello World!");
        log.debug("Heloo Word");
        return greetingService.sayGreeing();
    }
}
