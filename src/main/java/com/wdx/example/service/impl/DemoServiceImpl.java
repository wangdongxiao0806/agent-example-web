package com.wdx.example.service.impl;

import com.wdx.example.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public String wolcome(String name) {
        return "wolcome "+name+"!";
    }
}
