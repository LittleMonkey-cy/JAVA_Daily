package com.ruanyuan.dao.impl;

import java.math.BigDecimal;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ruanyuan.dao.AccountDao;

/**
 * 接口实现类
 * @author 陈钰
 *
 */
public class AccountDaoImpl implements AccountDao{
	/**
	 * 定义jdbcTemplate
	 */
	private JdbcTemplate jdbcTemplate;
	/**
	 * 实现setter方法
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 实现接口类方法
	 */
	@Override
	public void transfer(String outUser, String inUser, BigDecimal money) {
		// 收款时，收款用户的余额=现有余额+所汇金额
		jdbcTemplate.update("update customer set balance = balance + ? where username = ?",money,inUser);
		// 模拟系统运行时的突发性问题
//		 int i = 1/0;
		// 汇款是，汇款用户的鱼儿=现有金额-所汇金额
		jdbcTemplate.update("update customer set balance = balance - ? where username = ?",money,outUser);
		
	}
	

}
