package com.ruanyuan.service.impl;

import com.ruanyuan.dao.UserDao;
import com.ruanyuan.service.UserService;

public class UserServiceImpl implements UserService{
	/**
	 * 声明userDao属性	
	 */
	private UserDao userDao;
	/**
	 * 添加userDao	属性的setter方法，用于实现依赖注入
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 实现接口中的方法
	 */
	@Override
	public void say() {
		// 调用userDao中的say()方法，并执行输出语句
		this.userDao.say();
		System.out.println("userService hello world");
	}




}
