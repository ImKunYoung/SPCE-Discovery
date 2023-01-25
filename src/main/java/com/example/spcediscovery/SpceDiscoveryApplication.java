package com.example.spcediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpceDiscoveryApplication.class, args);
    }

}
