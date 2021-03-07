package com.ruanyuan.test;
/**
 * @author 陈钰
 */
import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ruanyuan.pojo.User;
import com.ruanyuan.utils.MyBatisUtils;

public class UserMapperTest {

	@Test
	public void selectByPrimaryKeyTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.selectByPrimaryKey";
		User user = sqlSession.selectOne(sqlId, 1);
		System.out.println("通过id查询==" + user);
		// 释放资源
		sqlSession.close();
	}

	@Test
	public void listUserTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.listUser";
		List<User> userList = sqlSession.selectList(sqlId);
		userList.forEach(user -> System.out.println(user));
		// 释放资源
		sqlSession.close();
	}

	@Test
	public void getUserByNameTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.getUserByName";
		List<User> userList = sqlSession.selectList(sqlId, "笑");
		userList.forEach(user -> System.out.println(user));
		// 释放资源
		sqlSession.close();
	}

	/**
	 * 插入用户信息
	 */
	@Test
	public void insertUserTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.insertUser";
		// 实例化对象
		User user = new User();
		user.setUserCode("1002");
		user.setUserName("赵云");
		user.setUserPassword("123456");
		user.setState("1");
		int row = sqlSession.insert(sqlId, user);
		// 通过返回受影响的行数来判断数据是否在内存中添加成功，进行信息提示
		if (row > 0) {
			System.out.println(user.getUserId());
			System.out.println("成功添加" + row + "条用户");
		} else {
			System.out.println("用户信息添加失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
		// 释放资源
		sqlSession.close();
	}

	/**
	 * 根据用户id修改用户信息
	 */
	@Test
	public void updateUserByIdTest() {
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		String sqlId = "com.ruanyuan.mapper.UserMapper.updateUserById";
		// 实例化对象
		User user = new User();
		user.setUserCode("1003");
		user.setUserName("赵云");
		user.setUserPassword("123456");
		user.setState("1");
		user.setUserId(BigInteger.valueOf(1));
		int row = sqlSession.insert(sqlId, user);
		// 通过返回受影响的行数来判断数据是否在内存中修改成功，进行信息提示
		if (row > 0) {
			System.out.println("成功修改" + row + "条用户");
		} else {
			System.out.println("用户信息修改失败");
		}
		// 进行事务的提交
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

	@Test
	public void deleteUserById() {
		// 连接数据库
		SqlSession sqlSession = MyBatisUtils.getSqlSession();
		// 定义位置
		String sqlId = "com.ruanyuan.mapper.UserMapper.deleteUserById";
		String sqlId1 = "com.ruanyuan.mapper.CustomerMapper.getCountByUserId";
		String sqlId2 = "com.ruanyuan.mapper.CustomerMapper.deleteByUserId";
		// 查询出需要删除的客户的数量
		int count1 = sqlSession.selectOne(sqlId1, 2);
		if(count1 > 0) {
			System.out.println("客户表中存在该用户");
		}
		// 删除客户，返回受影响的条数（实际删除的数量）
		int count2 = sqlSession.delete(sqlId2, 2);
		if (count2 > 0) {
			System.out.println("成功删除"+count2+"条客户信息");
		}
		// 提交事务
		sqlSession.commit();
		// 删除用户信息
		int count3 = sqlSession.delete(sqlId, 2);
		if (count3 > 0) {
			System.out.println("成功删除"+count3+"条用户信息");
		}
		// 提交事务
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}
}
