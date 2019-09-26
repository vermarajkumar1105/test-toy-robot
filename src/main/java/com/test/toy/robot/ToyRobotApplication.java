package com.test.toy.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ToyRobotApplication {
	
	private final static Logger log = LoggerFactory.getLogger(ToyRobotApplication.class);

    public static void main(String[] args) {
    	log.info("Spring Boot Toy Robot Application Loading...");
        SpringApplication.run(ToyRobotApplication.class, args);
        log.info("Spring Boot Toy Robot Application Running...");
    }
}