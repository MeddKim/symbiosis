package com.noah.symbiosis.bootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Meddkim on 2017/11/18.
 */
@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient  //EnableDiscoveryClient用于除了eureka外的的多种注册中心客户端
@EnableAdminServer
public class BaseBootAdmin {
    public static void main(String[] args) {
        SpringApplication.run(BaseBootAdmin.class, args);
    }
}

