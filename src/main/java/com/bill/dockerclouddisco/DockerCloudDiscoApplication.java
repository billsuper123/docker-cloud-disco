package com.bill.dockerclouddisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DockerCloudDiscoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerCloudDiscoApplication.class, args);
    }
}
