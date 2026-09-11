package com.hamfizh.bookcatalog.impl;

import com.hamfizh.bookcatalog.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Value("${welcome.text}")
    private String welcomeText;

    @Override
    public String sayGreeing() {
        return this.welcomeText;
    }
}
