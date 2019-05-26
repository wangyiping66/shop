package com.fm.shop.shopconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringCloudApplication
@Slf4j
public class ShopConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShopConsumerApplication.class, args);

	}

	@Override
	public void run(String... args) {
		log.info("shop-consumer >>> 消费者启动成功");
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}


