package com.ruanyuan.test;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.dao.AccountDao;

/**
 * 测试方法
 * @author 陈钰
 *
 */
public class SpringtxTest {
	/**
	 * 测试转账方法
	 */
	@Test
	public void txTest() {
		String xmlPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// 获取AccountDao实例
		AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
		// 调用实例中的转账方法
		accountDao.transfer("张三", "李四", BigDecimal.valueOf(100.00));
		// 输出提示信息
		System.out.println("转账成功");
	}
}
