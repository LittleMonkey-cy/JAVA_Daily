package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.annotation.UserController;

/**
 * 测试类
 * @author 陈钰
 *
 */
public class AnnotationTest {
	@Test
	public void annotationTest() {
		// 定义配置文件路径
		String xmlPath = "com/ruanyuan/annotation/beans.xml";
		// 加载配置文件，并对Bean进行实例化操作
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// 获取UserController实例
		UserController userController = (UserController) applicationContext.getBean("userController");
		// 调用UserController中的save方法
		userController.save();
	}
}
