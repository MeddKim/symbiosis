package com.noah.symbiosis.account.controller;

import com.noah.symbiosis.account.feign.AccountClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {


    @Autowired
    private AccountClient accountClient;

    @RequestMapping("/index")
    public String index(){
        log.info("get info from account-service...");
        return accountClient.index();
    }
}
