package com.fm.shop.shopuser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class ShopUserApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShopUserApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info("shop-user-service >>> 启动成功");
	}
}

