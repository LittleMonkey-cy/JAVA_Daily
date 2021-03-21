package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.constructor.Bean;

public class ConstructorTest {
	@Test
	public void constructorTest() {
		// 定义配置文件的路径
		String PathXml = "applicationContext.xml";
		// 加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PathXml);
		// 通过容器获取Bean实例
		Bean bean = (Bean)applicationContext.getBean("bean");
		// 输出
		System.out.println(bean);
	}
}
