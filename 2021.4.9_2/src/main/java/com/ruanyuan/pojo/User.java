package com.ruanyuan.pojo;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

/** @author 陈钰 @Date 2021/4/8 16:47 @Description 用户实体类 @Version 1.0 */
public class User {
  /** 用户编号 */
  private BigInteger userId;
  /** 用户用于登录的用户名 */
  private String userCode;
  /** 用户真实姓名 */
  private String userName;
  /** 用户密码 */
  private String userPassword;
  /** 用户手机号 */
  private String phone;
  /** 用户地址 */
  private String address;
  /** 用户权限 */
  private String userState;
  /** 用户头像 */
  private String headerImage;
  private MultipartFile file;

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

  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getHeaderImage() {
    return headerImage;
  }

  public void setHeaderImage(String headerImage) {
    this.headerImage = headerImage;
  }

  public MultipartFile getFile() {
    return file;
  }

  public void setFile(MultipartFile file) {
    this.file = file;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userCode='" + userCode + '\'' +
            ", userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", userState='" + userState + '\'' +
            ", headerImage='" + headerImage + '\'' +
            ", file=" + file +
            '}';
  }
}
