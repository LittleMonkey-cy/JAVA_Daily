package com.ruanyuan.factory;

public class Factory {

	/**
	 * 无参构造
	 */
	public Factory() {
		super();
		System.out.println("工厂实例化");
	}
	/**
	 * 使用工厂创建Bean实例
	 */
	public Bean createBean() {
		return new Bean();
	}
	
}
