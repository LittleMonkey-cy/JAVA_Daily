package com.ruanuan.test;

import org.junit.Test;

import com.ruanyuan.cglib.CglibProxy;
import com.ruanyuan.cglib.UserDao;
import com.ruanyuan.cglib.UserDaoImpl;
/**
 * 测试类
 * @author 陈钰
 *
 */
public class CglibTest {
	/**
	 * 测试使用CGlib代理方法事项aop切面化
	 */
	@Test
	public void cglibTest() {
		// 创建代理对象
		CglibProxy cglibProxy = new CglibProxy();
		// 创建目标对象
		UserDao userDao = new UserDaoImpl();
		// 获取增强后的目标对象
		UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
		// 执行方法
		// 添加用户
		userDao1.addUser();
		// 删除用户
		userDao1.deleteUser();
	}
}
