package com.ruanyuan.pojo;

import java.math.BigInteger;

public class User {
	
	private BigInteger userId;

    private String userCode;

    private String userName;

    private String userPassword;

    private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", userPassword="
				+ userPassword + ", State=" + state + "]";
	}
    
}
