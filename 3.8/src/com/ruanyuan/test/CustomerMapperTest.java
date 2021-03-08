package com.ruanyuan.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.Customer;
import com.ruanyuan.utils.MyBatisUtils;

public class CustomerMapperTest {
	@Test
	public void getCustomerByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerById";
		Customer customer = sqlSession.selectOne(sqlId, 1);
		System.out.println(customer);
		// 释放资源
		sqlSession.close();
	}

	@Test
	public void getCustomerByNameTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByName";
		List<Customer> custmoerList = sqlSession.selectList(sqlId, "韩");
		// 遍历
		custmoerList.forEach(customer -> System.out.println(customer));
		// 释放资源
		sqlSession.close();
	}

	/**
	 * 根据用户名和地址查询
	 */
	@Test
	public void getCustomerByNameAndAddressTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByNameAndAddress";
		Customer customer = new Customer();
		customer.setCustName("刘备");
		// customer.setCustAddress("石家庄");
		List<Customer> customerList = sqlSession.selectList(sqlId, customer);
		for (Customer customer2 : customerList) {
			System.out.println(customer2);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 根据客户名或者地址来二选一的进行查询
	 */
	@Test
	public void getCustomerByNameOrAddressTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByNameOrAddress";
		Customer customer = new Customer();
		// customer.setCustName("刘");
		customer.setCustAddress("石家庄");
		List<Customer> customerList = sqlSession.selectList(sqlId, customer);
		for (Customer customer2 : customerList) {
			System.out.println(customer2);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 使用where标签sql语句中的where，不论在编写测试方法时有几个条件，只根据第一个符合要求的查询条件查询客户信息功能
	 */
	@Test
	public void getCustomerByIndustryAndNameTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByIndustryAndName";
		Customer customer = new Customer();
		customer.setCustName("刘");
		customer.setCustIndustry("IT");
		List<Customer> customerList = sqlSession.selectList(sqlId, customer);
		for (Customer customer2 : customerList) {
			System.out.println(customer2);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 使用trim标签
	 */
	@Test
	public void getCustomerByIndustryOrNameTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByIndustryOrName";
		Customer customer = new Customer();
		customer.setCustName("刘");
		customer.setCustIndustry("服务业");
		List<Customer> customerList = sqlSession.selectList(sqlId, customer);
		for (Customer customer2 : customerList) {
			System.out.println(customer2);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 根据客户ID批量查询客户信息
	 */
	@Test
	public void getCustomerByIdsTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByIds";
		// 创建list集合
		List<Integer> ids = new ArrayList<Integer>();
		// 封装查询id
		ids.add(2);
		ids.add(3);
		ids.add(4);
		List<Customer> customerList = sqlSession.selectList(sqlId, ids);
		for (Customer customer2 : customerList) {
			System.out.println(customer2);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 根据客户名称查询客户信息（模糊查询）
	 */
	@Test
	public void getCustomerByNamesTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.getCustomerByNames";
		// 创建对象
		Customer customer = new Customer();
		customer.setCustName("刘");
		List<Customer> customerList = sqlSession.selectList(sqlId, customer);
		// 遍历输出客户信息
		for (Customer customer1 : customerList) {
			System.out.println(customer1);
		}
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 向客户表中添加数据
	 */
	@Test
	public void insertCustomerTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.isnertCustomer";
		// 实例化对象
		Customer customer = new Customer();
		customer.setCustName("刘备");
		customer.setCustAddress("石家庄");
		customer.setCustCreateId(1);
		customer.setCustIndustry("服务业");
		customer.setCustSourrce("网络");
		customer.setCustUserid(2);
		int row = sqlSession.insert(sqlId, customer);
		// 通过返回受影响的行数来判断数据是否在内存中添加成功，进行信息提示
		if (row > 0) {
			System.out.println(customer.getCustId());
			System.out.println("成功添加" + row + "条客户");
		} else {
			System.out.println("客户信息添加失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 根据客户id修改客户信息
	 */
	@Test
	public void updateCustomerByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.updateCustomerById";
		// 实例化对象
		Customer customer = new Customer();
		customer.setCustId(BigInteger.valueOf(1));
		customer.setCustName("刘备");
		customer.setCustAddress("石家庄");
		customer.setCustIndustry("旅游业");
		int row = sqlSession.update(sqlId, customer);
		// 通过返回受影响的行数来判断数据是否在内存中添加成功，进行信息提示
		if (row > 0) {
			System.out.println("成功修改" + row + "条客户信息");
		} else {
			System.out.println("客户信息修改失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();

	}

	/**
	 * 使用set标签改进后的更新语句
	 */
	@Test
	public void updateCustomerTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.updateCustomer";
		// 实例化对象
		Customer customer = new Customer();
		customer.setCustId(BigInteger.valueOf(1));
		// customer.setCustName("刘备");
		customer.setCustAddress("石家庄");
		customer.setCustIndustry("旅游业");
		int row = sqlSession.update(sqlId, customer);
		// 通过返回受影响的行数来判断数据是否在内存中添加成功，进行信息提示
		if (row > 0) {
			System.out.println("成功修改" + row + "条客户信息");
		} else {
			System.out.println("客户信息修改失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();

	}

	/**
	 * 根据客户id删除客户信息
	 */
	@Test
	public void deleteByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.CustomerMapper.deleteById";
		int row = sqlSession.delete(sqlId, 7);
		if (row > 0) {
			System.out.println("成功删除" + row + "条客户信息");
		} else {
			System.out.println("客户信息修改失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

}
