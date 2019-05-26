package com.fm.shop.shopeureka;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class ShopEurekaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShopEurekaApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info("shop-eureka-service >>> 启动成功");
	}

}

