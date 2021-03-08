package com.ruanyuan.pojo;

import java.math.BigInteger;

public class Interview {

    private BigInteger interId;

    private Integer interCustId;

    private Integer interUserId;

    private String interRecord;

    private String interDatetime;

	public BigInteger getInterId() {
		return interId;
	}

	public void setInterId(BigInteger interId) {
		this.interId = interId;
	}

	public Integer getInterCustId() {
		return interCustId;
	}

	public void setInterCustId(Integer interCustId) {
		this.interCustId = interCustId;
	}

	public Integer getInterUserId() {
		return interUserId;
	}

	public void setInterUserId(Integer interUserId) {
		this.interUserId = interUserId;
	}

	public String getInterRecord() {
		return interRecord;
	}

	public void setInterRecord(String interRecord) {
		this.interRecord = interRecord;
	}

	public String getInterDatetime() {
		return interDatetime;
	}

	public void setInterDatetime(String interDatetime) {
		this.interDatetime = interDatetime;
	}

	@Override
	public String toString() {
		return "Interview [interId=" + interId + ", interCustiid=" + interCustId + ", interUserid=" + interUserId
				+ ", interRecord=" + interRecord + ", interDatetime=" + interDatetime + "]";
	}
    
}
