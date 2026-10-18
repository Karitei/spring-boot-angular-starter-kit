package com.starterkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class StarterKitApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterKitApplication.class, args);
    }
}
