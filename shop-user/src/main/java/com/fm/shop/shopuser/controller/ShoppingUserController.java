package com.fm.shop.shopuser.controller;


import com.fm.shop.shopuser.VO.ShoppingUserVO;
import com.fm.shop.shopuser.common.Result;
import com.fm.shop.shopuser.entity.ShoppingUserEntity;
import com.fm.shop.shopuser.service.ShoppingUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @Auther: wangping
 * @Date: 2019/1/4
 * @Description:
 */
@RestController
@RequestMapping("/users")
@Api(tags = "user", description = "用户控制器")
@Slf4j
public class ShoppingUserController {


    @Autowired
    private RedisTemplate redisTemplate;


    int i=1;
    @Autowired
    private DiscoveryClient client;

    @Resource
    private ShoppingUserService shoppingUserService;

    @GetMapping("/{id}")
    public ShoppingUserEntity findById(@PathVariable Long id) throws InterruptedException {
        System.out.println(i++);
        List<String> services = client.getServices();
        int sleepTime = new Random().nextInt(2000);
        System.out.println(sleepTime+"-----------");
        return shoppingUserService.updateNameById(id);
    }
    @GetMapping("/testRequestParam")
    public String testRequestParam(@RequestParam String name) {
        return "name" + name+"哈哈，你不是抓到我了吗";
    }

    @GetMapping("/testRequestHeader")
    public String findById(@RequestHeader String name,@RequestHeader Integer id) {
        return name+ "+" +id;
    }

    @GetMapping("/testRequestBody")
    public ShoppingUserEntity findById(@RequestBody ShoppingUserEntity shoppingUserEntity) {
        return shoppingUserEntity;

    }


    /*public static void main (String[] args) {

        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "tom");
        System.out.println(valueOperations.get("name"));



    }
*/









    /*@GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return this.userRepository.findById(id);
    }*/
}
