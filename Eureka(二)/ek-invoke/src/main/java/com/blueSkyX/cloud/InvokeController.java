package com.blueSkyX.cloud;

import com.google.common.collect.Lists;
import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;

@RestController
@Configuration
public class InvokeController {

    @Autowired
    EurekaClient eurekaClient;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/invoke")
    public String invoke() {
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://ek-provider/hello", String.class);
    }

    @RequestMapping("/getServices")
    public void getServices() {
        Applications applications = eurekaClient.getApplications();
        List<Application> registereds = applications.getRegisteredApplications();
        for (Application registered : registereds) {
            System.out.println("服务: " + registered.getName());
            System.out.print(" 实例:");
            for (InstanceInfo info : registered.getInstances()) {
                System.out.print(" ");
                System.out.print(info.getHomePageUrl());
            }
            System.out.println("");
        }

    }
}
