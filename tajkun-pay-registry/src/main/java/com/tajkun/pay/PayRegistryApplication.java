package com.tajkun.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 10:47
 **/
@EnableEurekaServer
@SpringBootApplication
public class PayRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayRegistryApplication.class, args);
    }
}