package com.volleyball.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolleyBallController {
	
	@GetMapping("/index")
	public String sayHello() {
		return "Hello, this is volleyball system.";
	}

}
