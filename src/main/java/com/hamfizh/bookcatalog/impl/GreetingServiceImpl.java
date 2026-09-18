package com.hamfizh.bookcatalog.impl;

import com.hamfizh.bookcatalog.config.ApplicationProperties;
import com.hamfizh.bookcatalog.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

//    @Value("${welcome.text}")
//    private String welcomeText;
//
//    @Value("${time-zone}")
//    private String timezone;
//
//    @Value("${currency}")
//    private String currency;
    private ApplicationProperties applicationProperties;

    public GreetingServiceImpl(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public String sayGreeing() {
//        return this.welcomeText+" Your Time : " + timezone + ", Your Currency: " + currency;

        return applicationProperties.getWelcomeText() +
                " Your Time ZONE " + applicationProperties.getTimezone() +
                " Your Currency " + applicationProperties.getCurrency();
    }
}
