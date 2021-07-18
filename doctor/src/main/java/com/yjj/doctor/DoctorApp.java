package com.yjj.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DoctorApp {
    public static void main(String[] args) {
        SpringApplication.run(DoctorApp.class,args);
    }
}
