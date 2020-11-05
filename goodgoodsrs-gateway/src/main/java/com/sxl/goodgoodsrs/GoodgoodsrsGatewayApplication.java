package com.sxl.goodgoodsrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@EnableHystrix
@SpringBootApplication
public class GoodgoodsrsGatewayApplication {

    public static void main(String[] args) {
        System.out.println(SpringApplication.class.getClassLoader().getResource("META-INF/spring.factories"));
        SpringApplication.run(GoodgoodsrsGatewayApplication.class, args);
    }
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().build();
    }
}

