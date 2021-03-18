package com.ruanyuan.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.mapper.EmployeeMapper;
import com.ruanyuan.pojo.Employee;
import com.ruanyuan.utils.MyBatisUtils;

public class EmployeeMapperTest {
	/**
	 * 一级缓存
	 */
	@Test
	public void getEmployeeById() {
		// 创建sqlSession
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class); 
		// 一级缓存（默认自动开启）
		// 第一次查询
		Employee employee = employeeMapper.getEmployeeByID(1);
		System.out.println(employee.toString());
		// 第二次查询，同一个SqlSession对象，直接从一级缓存中拿出上次查询的结果，不再向数据库中发送sql语句
		Employee employee2 = employeeMapper.getEmployeeByID(1);
		System.out.println(employee2.toString());
		// 关闭资源
		sqlSession.close();
	}
	/**
	 * 二级缓存
	 * 只要调用过mapper映射文件，sql语句就一直存在
	 */
	@Test
	public void getEmployeeById2() {
		// 创建sqlSession
		SqlSession sqlSession1 = MyBatisUtils.getSqlSession();
		EmployeeMapper employeeMapper = sqlSession1.getMapper(EmployeeMapper.class); 
		// 一级缓存（默认自动开启）
		// 第一次查询
		Employee employee = employeeMapper.getEmployeeByID(1);
		System.out.println(employee.toString());
		sqlSession1.close();
		// 第二次查询，同一个SqlSession对象，
		SqlSession sqlSession2 = MyBatisUtils.getSqlSession();
		EmployeeMapper employeeMapper1 = sqlSession2.getMapper(EmployeeMapper.class); 
		Employee employee2 = employeeMapper.getEmployeeByID(1);
		System.out.println(employee2.toString());
		sqlSession2.close();
		// 第三次查询
		SqlSession sqlSession3 = MyBatisUtils.getSqlSession();
		EmployeeMapper employeeMapper2 = sqlSession3.getMapper(EmployeeMapper.class); 
		Employee employee3 = employeeMapper.getEmployeeByID(1);
		System.out.println(employee3.toString());
		// 关闭资源
		sqlSession3.close();
	}
}
