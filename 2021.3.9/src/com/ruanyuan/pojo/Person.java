package com.ruanyuan.pojo;

import java.math.BigInteger;

/**
 * 公民表实体类
 * 
 * @author 陈钰
 *
 */
public class Person {
	/**
	 * 主键id
	 */
	private BigInteger id;
	/**
	 * 公民姓名
	 */
	private String name;
	/**
	 * 公民住址
	 */
	private String address;
	/**
	 * 身份证号外键（外键对象）
	 */
	private IDCode codeId;
	/**
	 * 给私有属性的getter和setter方法
	 * 
	 */
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public IDCode getCodeId() {
		return codeId;
	}

	public void setCodeId(IDCode codeId) {
		this.codeId = codeId;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", codeId=" + codeId + "]";
	}

}
