package com.yjj.nurse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NurseApp {
    public static void main(String[] args) {
        SpringApplication.run(NurseApp.class,args);
    }
}
