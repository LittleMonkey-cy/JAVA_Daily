package com.ruanuan.test;

import org.junit.Test;

import com.ruanyuan.jdk.JdkProxy;
import com.ruanyuan.jdk.UserDao;
import com.ruanyuan.jdk.UserDaoImpl;

/**
 * 切面的测试类
 * @author 陈钰
 *
 */
public class AspectTest {
	@Test
	public void aspectTest() {
		// 创建代理对象
		JdkProxy jdkProxy = new JdkProxy();
		// 创建目标对象,多肽父类引用指向子类对象
		UserDao userDao = new UserDaoImpl();
		// 从代理对象中获取增强后的目标对象
		UserDao userDao1 = (UserDao)jdkProxy.createProxy(userDao);
		// 执行方法
		// 增加用户信息
		userDao1.addUser();
		// 删除用户信息
		userDao1.deleteUser();
	}
}
