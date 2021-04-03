package com.ruanyuan.aspectj.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class XmlTest {
	/**
	 * 基于xml的测试
	 */
	@Test
	public void xmlTest() {
		String xmlPath = "com/ruanyuan/aspect/xml/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
	}
	/**
	 * 基于注解的测试
	 */
	@Test
	public void annotationTest() {
		String xmlPath = "com/ruanyuan/aspect/xml/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
	}

}
