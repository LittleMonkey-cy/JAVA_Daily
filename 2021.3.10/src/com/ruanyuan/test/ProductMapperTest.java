package com.ruanyuan.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.Product;
import com.ruanyuan.utils.MyBatisUtils;

public class ProductMapperTest {
	/**
	 * 嵌套查询 多对多
	 */
	@Test
	public void getProductByIdTest() {
		// 获取连接
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.ProductMapper.getProductById";
		Product product = sqlSession.selectOne(sqlId, 1);
		System.out.println(product);
		// 关闭资源
		sqlSession.close();
	}
	/**
	 * 嵌套结果查询 多对多
	 */
	@Test
	public void getProductByIdTest1() {
		// 获取连接
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.ProductMapper.getAllProduct";
		Product product = sqlSession.selectOne(sqlId, 1);
		System.out.println(product);
		// 关闭资源
		sqlSession.close();
	}
}
