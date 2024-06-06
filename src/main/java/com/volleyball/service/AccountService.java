package com.volleyball.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volleyball.dao.AccountDao;
import com.volleyball.demo.Account;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
		
	}

}
