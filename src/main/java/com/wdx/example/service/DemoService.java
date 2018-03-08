package com.wdx.example.service;

import com.wdx.middleware.annontation.Agent;

public interface DemoService {
    @Agent
    public String wolcome(String name);
}
