package com.blueSkyX.firstEkServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EKServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EKServerApplication.class).run(args);
    }
}
