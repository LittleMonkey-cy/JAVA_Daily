package com.ruanyuan.test;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.Interview;
import com.ruanyuan.utils.MyBatisUtils;

public class InterviewMapperTest {
	/**
	 * 根据id查询
	 */
	@Test
	public void getByPrimaryKey() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.Interview.getByPrimaryKey";
		List<Interview> interList = sqlSession.selectList(sqlId);
		for (Interview interview : interList) {
			System.out.println(interview);
		}
		sqlSession.close();
	}

	/**
	 * 插入数据
	 */

	public void insertInterviewInfoTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.Interview.insertInterviewInfo";
		// 实例化对象
		Interview interview = new Interview();
		interview.setInterCustId(1);
		interview.setInterUserId(2);
		interview.setInterRecord("哈哈哈");
		interview.setInterDatetime("2021-3-6");
		int row = sqlSession.insert(sqlId, interview);
		if (row > 0) {
			System.out.println(interview.getInterId());
			System.out.println("成功添加" + row + "条数据");
		} else {
			System.out.println("添加失败");
		}
		// 提交事务
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

	/**
	 * 根据访谈id修改访谈信息
	 */
	@Test
	public void updateInterviewByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.Interview.updateInterviewById";
		// 实例化对象
		Interview interview = new Interview();
		interview.setInterId(BigInteger.valueOf(1));
		interview.setInterRecord("本次访谈客户回复说对本公司非常的有好感");
		interview.setInterDatetime("2021-3-5");
		int row = sqlSession.update(sqlId, interview);
		if (row > 0) {
			System.out.println(interview.getInterId());
			System.out.println("成功修改" + row + "条数据");
		} else {
			System.out.println("修改失败");
		}
		// 提交事务
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}
	/**
	 * 根据访谈id删除访谈信息
	 */
	@Test
	public void deleteInterviewByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.Interview.deleteInterviewById";
		int row = sqlSession.delete(sqlId, 1);
		if (row > 0) {
			System.out.println("成功删除"+row+"条访谈信息");
		}else {
			System.out.println("删除失败");
		}
		// 提交事务
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

}
