package com.fm.shop.shopgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;


@EnableZuulProxy
@SpringBootApplication
@ComponentScan(value = "filter")
public class ShopGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopGatewayApplication.class, args);
	}

}

