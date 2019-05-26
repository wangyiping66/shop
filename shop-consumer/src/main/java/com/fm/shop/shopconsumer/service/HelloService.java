package com.fm.shop.shopconsumer.service;


import com.fm.shop.shopuser.VO.ShoppingUserVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;



    @CacheResult(cacheKeyMethod = "testCacheKeyMethod")
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService(){
        int id = 1;
        ShoppingUserVO shoppingUserVO = this.restTemplate.getForObject("http://shop-user-server/users/{id}", ShoppingUserVO.class, id);
        //return restTemplate.getForObject("http://shop-user-serve/users/1", ShoppingUserVO.class).toString();
        return shoppingUserVO.toString();
    }

    public String helloFallBack(){
        return "error";
    }
    public String testCacheKeyMethod(String id){
        System.out.println(id);
        return id;
    }
}
