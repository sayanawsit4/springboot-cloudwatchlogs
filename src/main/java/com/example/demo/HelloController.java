package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final org.slf4j.Logger logger  = org.slf4j.LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/test")
    String home() {
        logger.info("HelloWorld");
        logger.debug("Welcome {}");
        return "hello";
    }
}