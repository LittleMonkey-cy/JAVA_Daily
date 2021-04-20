package com.ruanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** @author 陈钰 @Date 2021/3/30 16:20 @Description 控制层类 @Version 1.0 */
@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
  public String toAddUser() {
    return "user";
  }

  @RequestMapping(value = "/toSuccess", method = RequestMethod.GET)
  public String toSuccess() {
    System.out.println("跳转成功");
    return "success";
  }

  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
  public String addUser(String username, String password) {
    // 输出接收到的值
    System.out.println("用户名:" + username + "密码：" + password);
    try {
      // 接收值
      String content = "用户名：" + username + "密码：" + password + "\n";
      // 创建文件
      File file = new File("E://userList.txt");
      if (!file.exists()) {
        file.createNewFile();
      } else {
        // 使用true，即进行append file
        FileWriter fileWriter = new FileWriter("E://" + file.getName(), true);
        // 写入文件
        fileWriter.write(content);
        // 刷新
        fileWriter.flush();
        // 关闭
        fileWriter.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "redirect:toSuccess";
  }
}
