package com.ruanyuan.pojo;

import java.math.BigInteger;

/** @author 陈钰 @Date 2021/3/24 16:35 @Description 客户实体类 @Version 1.0 */
public class Customer {
	private BigInteger custId;

	private String custName;

	private Integer custUserId;

	private Integer custCreateId;

	private String custSourrce;

	private String custIndustry;

	private String custLevel;

	private String custLinkman;

	private String custPhone;

	private String custMobile;

	private String custZipcode;

	private String custAddress;

	public BigInteger getCustId() {
		return custId;
	}

	/**
	 * 无参构造
	 */
	public Customer() {
	}

	/**
	 * 有参构造
	 * 
	 * @param custId
	 * @param custName
	 * @param custUserId
	 * @param custCreateId
	 * @param custSourrce
	 * @param custIndustry
	 * @param custLevel
	 * @param custLinkman
	 * @param custPhone
	 * @param custMobile
	 * @param custZipcode
	 * @param custAddress
	 */
	public Customer(BigInteger custId, String custName, Integer custUserId, Integer custCreateId, String custSourrce,
			String custIndustry, String custLevel, String custLinkman, String custPhone, String custMobile,
			String custZipcode, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custUserId = custUserId;
		this.custCreateId = custCreateId;
		this.custSourrce = custSourrce;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.custLinkman = custLinkman;
		this.custPhone = custPhone;
		this.custMobile = custMobile;
		this.custZipcode = custZipcode;
		this.custAddress = custAddress;
	}

	public void setCustId(BigInteger custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustUserId() {
		return custUserId;
	}

	public void setCustUserId(Integer custUserId) {
		this.custUserId = custUserId;
	}

	public Integer getCustCreateId() {
		return custCreateId;
	}

	public void setCustCreateId(Integer custCreateId) {
		this.custCreateId = custCreateId;
	}

	public String getCustSourrce() {
		return custSourrce;
	}

	public void setCustSourrce(String custSourrce) {
		this.custSourrce = custSourrce;
	}

	public String getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}

	public String getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustLinkman() {
		return custLinkman;
	}

	public void setCustLinkman(String custLinkman) {
		this.custLinkman = custLinkman;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public String getCustZipcode() {
		return custZipcode;
	}

	public void setCustZipcode(String custZipcode) {
		this.custZipcode = custZipcode;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer{" + "custId=" + custId + ", custName='" + custName + '\'' + ", custUserId=" + custUserId
				+ ", custCreateId=" + custCreateId + ", custSourrce='" + custSourrce + '\'' + ", custIndustry='"
				+ custIndustry + '\'' + ", custLevel='" + custLevel + '\'' + ", custLinkman='" + custLinkman + '\''
				+ ", custPhone='" + custPhone + '\'' + ", custMobile='" + custMobile + '\'' + ", custZipcode='"
				+ custZipcode + '\'' + ", custAddress='" + custAddress + '\'' + '}';
	}
}
