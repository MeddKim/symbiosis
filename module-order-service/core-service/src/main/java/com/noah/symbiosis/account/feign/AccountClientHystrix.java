package com.noah.symbiosis.account.feign;

import org.springframework.stereotype.Component;

/**
 * Hystrix降级方案
 */
@Component
public class AccountClientHystrix implements AccountClient {

    @Override
    public String index() {
        return "请求失败";
    }
}
