package com.test.toy.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class ToyRobotApplication {

    public static void main(String[] args) {
    	log.info("Spring Boot Toy Robot Application Loading...");
        SpringApplication.run(ToyRobotApplication.class, args);
        log.info("Spring Boot Toy Robot Application Running...");
    }
}