package com.drugowick.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-app-config.xml")
public class JokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesAppApplication.class, args);
    }

}
