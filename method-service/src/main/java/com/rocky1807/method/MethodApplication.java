package com.rocky1807.method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MethodApplication {

    public static void main(String[] args) {
        SpringApplication.run(MethodApplication.class, args);
    }

}
