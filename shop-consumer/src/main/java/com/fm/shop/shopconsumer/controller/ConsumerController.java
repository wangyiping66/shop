package com.fm.shop.shopconsumer.controller;




import com.fm.shop.shopconsumer.service.HelloService;
import com.fm.shop.shopuser.VO.ShoppingUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloService helloService;

    @GetMapping("/users/{id}")
    public ShoppingUserVO findById(@PathVariable Long id) {

        ShoppingUserVO shoppingUserVO = this.restTemplate.getForObject("http://shop-user-server/users/{id}", ShoppingUserVO.class, id);

        System.out.println(shoppingUserVO+"哈哈，你不是抓到我了吗");

        return shoppingUserVO;
    }
    @GetMapping("/users")
    public String helloConsumer() {
        return helloService.helloService();
    }
}
