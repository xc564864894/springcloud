package com.blueSkyX.firstEkClient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class ClientController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("hello")
    public String hello() {
        RestTemplate restTemplate = getRestTemplate();
        String result = restTemplate.getForObject("http://first-ek-provider/hello", String.class);
        return "client: " + result;
    }
}
