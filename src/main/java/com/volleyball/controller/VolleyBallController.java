package com.volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.volleyball.demo.Account;
import com.volleyball.service.AccountService;

@RestController
public class VolleyBallController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/index")
	public String sayHello() {
		return "index";
	}

	@PostMapping("/signup")
	public String signUpUser(@RequestBody Account account) {
		accountService.addAccount(account);
		return "Sign up";
	}

}
