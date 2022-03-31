package com.redis.demo.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRedisController {

    @GetMapping("/cache")
    @Cacheable("cache")
    public String hello(){
        System.out.println("Olá sem cache");
        return "sem cache";
    }

    @GetMapping("/cancel")
    @CacheEvict("cache")
    public String cancel(){
        System.out.println("Clear cache");
        return "cancel cache";
    }
}
