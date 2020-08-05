package com.tajkun.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 11:10
 **/
@SpringBootApplication
@EnableEurekaClient
public class PayGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayGatewayApplication.class, args);
    }
}