package com.ruanyuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruanyuan.mapper.InterviewMapper;
import com.ruanyuan.service.InterviewService;
@Service
@Transactional
public class InterviewServiceImpl implements InterviewService{
	@Autowired
	private InterviewMapper InterviewMapper;
	/**
	 * 根据客户编号查询访谈记录
	 */
	@Override
	public int CountInterviewBycustId(Integer id) {
		// TODO Auto-generated method stub
		int row = this.InterviewMapper.getCountByCustomerId(id);
		return row;
	}
	/**
	 * 根据客户id信息删除访谈信息
	 */
	@Override
	public int deleteInterviewByCustId(Integer id) {
		int row = this.InterviewMapper.deleteInterviewByCustId(id);
		return row;
	}

}
