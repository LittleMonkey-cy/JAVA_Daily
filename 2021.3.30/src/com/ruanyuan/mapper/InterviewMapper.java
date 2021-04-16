package com.ruanyuan.mapper;
/**
 * 数据访问层
 * @author 陈钰
 *
 */
public interface InterviewMapper {
	/**
	 * 根据客户id查询在访谈表中是否存在记录
	 * @param id 客户id
	 * @return
	 */
	int getCountByCustomerId(Integer id);
	/**
	 * 根据客户id删除访问表中的信息
	 * @param cust_id 客户id
	 * @return
	 */
	int deleteInterviewByCustId(Integer cust_id);
}
