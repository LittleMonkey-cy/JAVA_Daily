package com.ruanyuan.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.Person;
import com.ruanyuan.utils.MyBatisUtils;

public class PersonTest {
	/**
	 * 嵌套查询（子查询）的测试方法
	 */
	@Test
	public void getPersonTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.PersonMapper.getPerson";
		List<Person> personList = sqlSession.selectList(sqlId, 1);
		for (Person person : personList) {
			System.out.println(person);
			// System.out.println(person.getCodeId());
		}
		sqlSession.close();
	}
	/**
	 * 嵌套结果查询（连接查询）的测试方法
	 */
	@Test
	public void getPersonTest2() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.PersonMapper.getPresonWithCode";
		List<Person> personList = sqlSession.selectList(sqlId, 1);
		for (Person person : personList) {
			System.out.println(person);
			// System.out.println(person.getCodeId());
		}
		sqlSession.close();
	}
}
