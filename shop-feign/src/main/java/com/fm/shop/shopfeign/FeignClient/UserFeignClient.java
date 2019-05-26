package com.fm.shop.shopfeign.FeignClient;

import com.fm.shop.shopuser.VO.ShoppingUserVO;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


@FeignClient(name = "shop-user-server",fallback=UserFeignClient.UserFeignClientImpl.class)
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    ShoppingUserVO findById(@PathVariable("id") Long id);


    /*@GetMapping("/users/testRequestParam")
    String testRequestParam(@RequestParam("name") String name);*/

    @Component
    class UserFeignClientImpl implements UserFeignClient{
        @Override
        public ShoppingUserVO findById(Long id) {
            System.out.println("出现这个就是请求失败了啊");
            return new ShoppingUserVO();
        }
    }

    /*@Component
    @Slf4j
    class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
        @Override
        public UserFeignClient create(Throwable throwable) {
            return new UserFeignClient() {
                @Override
                public ShoppingUserVO findById(Long id) {
                    log.error("进入回退逻辑", throwable);
                    return new ShoppingUserVO();
                    //System.out.println(throwable);
                    //return null;
                }
            };
        }
    }*/
}


