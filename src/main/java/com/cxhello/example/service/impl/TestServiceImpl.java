package com.cxhello.example.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cxhello.example.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author caixiaohui
 * @date 2020/11/26
 */
@Service
public class TestServiceImpl implements TestService {

    @SentinelResource(value = "sayHello")
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
