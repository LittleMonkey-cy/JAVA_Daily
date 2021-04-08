package com.ruanyuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.dao.CustomerDao;
import com.ruanyuan.pojo.Customer;

/**
 * 测试类
 * 
 * @author 陈钰
 *
 */
public class MyTest {
	@Test
	public void getCustomerByIdTest() {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
		Customer customer = customerDao.getCustomerById(1);
		System.out.println(customer);
	}
}
