package com.ruanyuan.pojo;

import java.math.BigInteger;

public class Customer {
	  private BigInteger custId;

	  private String custName;

	  private Integer custUserid;

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

	  public void setCustId(BigInteger custId) {
	    this.custId = custId;
	  }

	  public String getCustName() {
	    return custName;
	  }

	  public void setCustName(String custName) {
	    this.custName = custName;
	  }

	  public Integer getCustUserid() {
	    return custUserid;
	  }

	  public void setCustUserid(Integer custUserid) {
	    this.custUserid = custUserid;
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
		return "Customer [custId=" + custId + ", custName=" + custName + ", custUserid=" + custUserid
				+ ", custCreateId=" + custCreateId + ", custSourrce=" + custSourrce + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", custLinkman=" + custLinkman + ", custPhone=" + custPhone
				+ ", custMobile=" + custMobile + ", custZipcode=" + custZipcode + ", custAddress=" + custAddress + "]";
	}
	  
}
