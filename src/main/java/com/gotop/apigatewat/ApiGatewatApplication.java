package com.gotop.apigatewat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewatApplication.class, args);
    }

}
