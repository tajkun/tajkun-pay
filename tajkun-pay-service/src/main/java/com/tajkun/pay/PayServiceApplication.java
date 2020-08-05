package com.tajkun.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 13:42
 **/
@SpringBootApplication
@EnableEurekaClient
public class PayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServiceApplication.class, args);
    }
}