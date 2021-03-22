package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.pojo.User;

public class UserTest {
	/**
	 * 设置注入测试方法
	 */
	@Test
	public void setterTest() {
		// 加载配置文件。对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 设置注入
		User user1 = (User)applicationContext.getBean("user1");
		// 输出
		System.out.println("设值注入=="+user1);
	}
	/**
	 * 通过构造注入的测试方法
	 */
	@Test
	public void constructorTest() {
		// 加载配置文件。对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 设置注入
		User user1 = (User)applicationContext.getBean("user2");
		// 输出
		System.out.println("构造注入=="+user1);
	}
}
