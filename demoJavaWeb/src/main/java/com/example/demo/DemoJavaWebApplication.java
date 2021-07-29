package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"gov.vghtpe.controller","gov.vghtpe.service"})
public class DemoJavaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJavaWebApplication.class, args);
	}
}
