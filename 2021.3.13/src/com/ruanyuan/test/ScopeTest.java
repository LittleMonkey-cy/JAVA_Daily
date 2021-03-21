package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.scope.Scope;


/**
 * 测试类
 * @author 陈钰
 *
 */
public class ScopeTest {
	@Test
	public void singletonTest() {
		// 定义配置文件的路径
		String PathXml = "applicationContext.xml";
		// 加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PathXml);
		// 通过容器获取Bean实例1
		Scope scope1 = (Scope)applicationContext.getBean("scope");
		// 通过容器获取Bean实例1
		Scope scope2 = (Scope)applicationContext.getBean("scope");
		// 输出
		System.out.println("scope1=="+scope1);
		System.out.println("scope2=="+scope2);
	}
	@Test
	public void prototypeTest() {
		// 定义配置文件的路径
		String PathXml = "applicationContext.xml";
		// 加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PathXml);
		// 通过容器获取Bean实例1
		Scope scope1 = (Scope)applicationContext.getBean("prototype");
		// 通过容器获取Bean实例1
		Scope scope2 = (Scope)applicationContext.getBean("prototype");
		// 输出
		System.out.println("scope1=="+scope1);
		System.out.println("scope2=="+scope2);
	}
}
