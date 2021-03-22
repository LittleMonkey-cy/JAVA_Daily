package com.ruanyuan.pojo;

import java.math.BigInteger;
import java.util.List;

public class User {
	/**
	 * 编号
	 */
	private BigInteger id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户订单
	 */
	private List<String> list;

	/**
	 * 实现值的注入 1.无参构造 2.setter方法
	 */
	public User() {
		super();
		System.out.println("无参构造");
	}

	/**
	 * 使用构造注入， 提供所有参数的有参构造方法
	 * 
	 * @param id
	 * @param username
	 * @param password
	 * @param list
	 */
	public User(BigInteger id, String username, String password, List<String> list) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.list = list;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * setter方法
	 * 
	 * @param usesrname 用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * tostring
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", usesrname=" + username + ", password=" + password + ", list=" + list + "]";
	}

}
