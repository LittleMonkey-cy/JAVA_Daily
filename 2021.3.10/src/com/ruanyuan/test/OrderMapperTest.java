package com.ruanyuan.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.Order;
import com.ruanyuan.utils.MyBatisUtils;

public class OrderMapperTest {
	/**
	 * 嵌套查询 多对多
	 */
	@Test
	public void getAllOrderByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.OrderMapper.getAllOrderById";
		Order order = sqlSession.selectOne(sqlId,1);
		System.out.println(order);
		sqlSession.close();
	}
	/**
	 * 嵌套结果查询 多对多
	 */
	@Test
	public void getAllOrderByIdTest1() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.OrderMapper.getAllOrdeers";
		Order order = sqlSession.selectOne(sqlId,1);
		System.out.println(order);
		sqlSession.close();
	}
}
