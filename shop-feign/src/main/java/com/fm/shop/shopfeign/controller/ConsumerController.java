package com.fm.shop.shopfeign.controller;

import com.fm.shop.shopfeign.FeignClient.UserFeignClient;
import com.fm.shop.shopuser.VO.ShoppingUserVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    int i=1;
    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public ShoppingUserVO findById(@PathVariable Long id) {
        System.out.println(i++);
        return this.userFeignClient.findById(id);
    }


    /*@GetMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String name) {
        return userFeignClient.testRequestParam(name);
    }*/


}