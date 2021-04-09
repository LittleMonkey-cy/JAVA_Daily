package com.ruanyuan.test;

import java.math.BigInteger;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruanyuan.mapper.CustomerMapper;
import com.ruanyuan.pojo.Customer;
import com.ruanyuan.service.CustomerService;

/**
 * 测试类
 * @author 陈钰
 *
 */
public class MyTest {
	/**
	 * 根据id查询
	 */
	@Test
	public void getCustomerByIdTest() {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper customerMapper = context.getBean(CustomerMapper.class);
		Customer customer = customerMapper.getCustomerById(1);
		System.out.println(customer);
	}
	/**
	 * 查询所有客户信息
	 */
	@Test
	public void getCustomersTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper customerMapper = context.getBean(CustomerMapper.class);
		List<Customer> customers = customerMapper.getCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	/**
	 * 添加客户信息
	 */
	@Test
	public void insertCustomerTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = context.getBean(CustomerService.class);
		Customer customer = new Customer();
		customer.setCustName("及时雨");
		customer.setCustPhone("110");
		customer.setCustAddress("河北保定");
		customerService.insertCustomer(customer);
		System.out.println("添加成功");
	}
	/**
	 * 修改用户信息
	 */
	@Test
	public void updateCustomerByIdTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = context.getBean(CustomerService.class);
		// 实例化对象
		Customer customer = new Customer();
		customer.setCustId(BigInteger.valueOf(1));
		customer.setCustName("刘备");
		customer.setCustAddress("石家庄");
		int row = customerService.updateCustomerById(customer);
		if (row > 0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
	}
	/**
	 * 删除功能
	 */
	@Test
	public void deleteCustomerByIdTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = context.getBean(CustomerService.class);
		int row = customerService.deleteCustomerById(1);
		if(row > 0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}
}
