package com.blueSkyX.firstEkProvider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProviderController {

    @RequestMapping("hello")
    public String hello(HttpServletRequest request) {
        return "hello " + request.getRequestURL();
    }
}
