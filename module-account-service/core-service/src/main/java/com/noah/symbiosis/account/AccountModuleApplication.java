package com.noah.symbiosis.account;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Meddkim on 2017/11/18.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
@EnableFeignClients
public class AccountModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountModuleApplication.class, args);
    }
}

