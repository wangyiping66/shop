package com.fm.shop.shopfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ShopFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopFeignApplication.class, args);
	}

}

