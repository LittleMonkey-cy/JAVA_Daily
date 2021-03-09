package com.ruanyuan.pojo;
/**
 * 身份证号实体类
 * @author 陈钰
 *
 */

import java.math.BigInteger;

public class IDCode {
	/**
	 * 身份证号ID 主键
	 */
	private BigInteger id;
	/**
	 * 身份证号
	 */
	private String code;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "IDCode [id=" + id + ", code=" + code + "]";
	}
	
}
