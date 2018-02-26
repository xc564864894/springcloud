package com.blueSkyX.firstEkClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EkFirstClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EkFirstClientApplication.class).run(args);
    }
}
