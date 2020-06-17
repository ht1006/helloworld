package com.helen.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {
    private static final Log logger = LogFactory.getLog(HelloworldApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
        logger.info("SpringBootApplication Started !!!");
    }

}
