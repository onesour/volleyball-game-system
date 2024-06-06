package com.volleyball.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.volleyball.controller","com.volleyball.service","com.volleyball.dao"})
public class VolleyballGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolleyballGameApplication.class, args);
	}

}
