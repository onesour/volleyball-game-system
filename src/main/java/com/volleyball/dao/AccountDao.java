package com.volleyball.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.volleyball.demo.Account;

@Repository
public class AccountDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void addAccount(Account account) {
		System.out.println("EXCUTE INSERT account");
		String sqlString = "INSERT INTO account(account, password, name) VALUES (:accountString,:passwordString,:nameString)";
		Map<String, Object> map = new HashMap<>();
		map.put("accountString", account.getAccount());
		map.put("passwordString", account.getPassword());
		map.put("nameString", account.getName());
		namedParameterJdbcTemplate.update(sqlString, map);
//		jdbcTemplate.update("INSERT INTO Student(s_id, s_name, s_birth, s_sex) " + "VALUES (?,?,?,?))",
//				studentModel.getId(), studentModel.getName(), studentModel.getBirth(), studentModel.getSex());
	}

}
