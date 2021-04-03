package com.ruanyuan.aspectj.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class annotationTest {
	/**
	 * 基于注解的测试
	 */
	@Test
	public void annotationTest() {
		String xmlPath = "com/ruanyuan/aspect/annotation/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
	}

}
