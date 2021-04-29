package com.ruanyuan.controller;

import com.ruanyuan.pojo.User;
import com.ruanyuan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/** @author 陈钰 @Date 2021/4/7 18:54 @Description 控制器类 @Version 1.0 */
@Controller
public class LoginController {
  /**
   * 向用户登录界面进行跳转
   *
   * @return
   */
  @GetMapping("/login")
  public String toLogin() {
    return "login";
  }

  /**
   * 用户登录
   *
   * @param user 用户对象
   * @param model 视图
   * @param httpSession session对象
   * @return 接收页
   */
  @PostMapping("/login")
  public String login(User user, Model model, HttpSession httpSession) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = applicationContext.getBean(UserService.class);
    System.out.println(user.getUserCode());
    System.out.println(user.getUserPassword());
    User user1 = userService.login(user);
    // 从数据库总获取用户名和密码进行登录验证判断
    if (user1 != null) {
      // 将用户对象添加到session中
      httpSession.setAttribute("USER_SESSION", user);
      // 重定向方法跳转到主页
      return "redirect:main";
    } else {
      model.addAttribute("msg", "用户名或密码错误，请重新登录");
      return "login";
    }
  }

  /**
   * 向用户主页面进行跳转
   *
   * @return 主页面
   */
  @RequestMapping("/main")
  public String toMain() {
    return "main";
  }

  /**
   * 退出登录
   *
   * @param session session对象
   * @return 登录页面
   */
  @RequestMapping("/logout")
  public String logout(HttpSession session) {
    // 清除session
    session.invalidate();
    // 重定向登录页面的跳转方法
    return "redirect:login";
  }
}
