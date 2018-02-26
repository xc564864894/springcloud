package com.blueSkyX.firstEkProvider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@EnableEurekaClient
@SpringBootApplication
public class EkProviderApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int port = scanner.nextInt();
        new SpringApplicationBuilder(EkProviderApplication.class).properties("server.port=" + port).run(args);
    }
}
