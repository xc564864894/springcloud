package com.blueSkyX.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EkProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EkProviderApplication.class).run(args);
    }
}
