package com.aline.underwritermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.aline.core.repository")
@EntityScan(basePackages = "com.aline.core.model")
public class UnderwriterMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderwriterMicroserviceApplication.class, args);
    }

}
