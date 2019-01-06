package com.noah.symbiosis.account.controller;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${testvalue}")
    private String testValue;

    @RequestMapping("/accindex")
    public String index(){
        if(Strings.isNullOrEmpty(testValue)){
            return "未找到参数";
        }else {
            return testValue;
        }
    }
}
