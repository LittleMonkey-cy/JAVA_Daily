package com.ruanyuan.service;
/**
 * 业务逻辑层接口类
 * @author 陈钰
 *
 */
public interface InterviewService {
	int CountInterviewBycustId(Integer id);
	/**
	 * 根据客户id删除访问表中的信息
	 * @param id 客户id
	 * @return
	 */
	int deleteInterviewByCustId(Integer id);
}
