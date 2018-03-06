package com.blueSkyX.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EkServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EkServerApplication.class).run(args);
    }
}
