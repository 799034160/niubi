package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient  //启用发现客户端
@SpringBootApplication
public class Sp02ItemserviceApplication {
    //改个注释呗
	public static void main(String[] args) {
		SpringApplication.run(Sp02ItemserviceApplication.class, args);
	}

}
