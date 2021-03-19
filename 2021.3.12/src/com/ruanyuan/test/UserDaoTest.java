package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.dao.UserDao;
import com.ruanyuan.service.UserService;

public class UserDaoTest {

	@Test
	public void userDaoTest() {
		// 初始化配置容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过容器后去UserDao实例
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		// 调用实例化中的方法
		userDao.say();
	}
	@Test
	public void userServiceTest() {
		// 初始化配置容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.say();

	}
}
