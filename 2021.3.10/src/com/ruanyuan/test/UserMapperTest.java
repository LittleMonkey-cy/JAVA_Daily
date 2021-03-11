package com.ruanyuan.test;



import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.User;
import com.ruanyuan.utils.MyBatisUtils;

public class UserMapperTest {
	/**
	 * 嵌套查询测试方法
	 */
	@Test
	public void getUserAndOrderTest () {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.getUserAndOrder";
		User user = sqlSession.selectOne(sqlId, 1);
		System.out.println(user);
		sqlSession.close();
	}
	/**
	 * 嵌套结果查询测试方法
	 */
	@Test
	public void getUserAndOrder1Test () {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.getUserAndOrder1";
		User user = sqlSession.selectOne(sqlId, 1);
		System.out.println(user);
		sqlSession.close();
	}
	
}
