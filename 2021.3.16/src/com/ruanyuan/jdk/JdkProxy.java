package com.ruanyuan.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.ruanyuan.aspect.MyAspect;

public class JdkProxy implements InvocationHandler{
	/**
	 * 声明目标接口类
	 */
	private UserDao userDao;
	/**
	 * 创建代理方法
	 * @param userDao
	 * @return
	 */
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		// 类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		// 被代理对象实现所有接口
		Class[] class1 = userDao.getClass().getInterfaces();
		// 使用代理类，进行增强方法的操作，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, class1, this);
	}
	/**
	 * 所有动态代理的方法调用，都会交由invoke()方法去处理
	 * proxy被代理后的兑现IG
	 * method将要被执行的方法信息(反射)
	 * args 执行方法是需要的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 声明切面
		MyAspect myaspect = new MyAspect();
		// 前增强(检查方法)
		myaspect.check_Permissions();
		// 在目标类上调用方法，并传入参数
		Object obj = method.invoke(userDao, args);
		// 后增强(日志写入方法)
		myaspect.log();
		return obj;
	}

}
