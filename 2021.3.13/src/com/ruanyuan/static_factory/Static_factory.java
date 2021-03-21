package com.ruanyuan.static_factory;

public class Static_factory {
	/**
	 * 使用静态工厂创建Bean实例
	 * @return
	 */
	public static Bean createBean() {
		System.out.println("使用静态工厂创建Bean实例");
		return new Bean();
	}
}
