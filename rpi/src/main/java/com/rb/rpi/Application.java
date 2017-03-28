package com.rb.rpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by rahul on 22-3-17.
 */

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
