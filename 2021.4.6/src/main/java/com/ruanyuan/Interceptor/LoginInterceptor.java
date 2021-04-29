package com.ruanyuan.Interceptor;

import com.ruanyuan.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** @author 陈钰 @Date 2021/4/7 19:23 @Description 拦截器 @Version 1.0 */
public class LoginInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    // 获取请求的url地址
    String requestURI = request.getRequestURI();
    // 除了login.jsp是可以公开访问的，其他的url都进行拦截控制，放开登录，登录不做拦截
    if (requestURI.indexOf("/login") >= 0) {
      return true;
    }
    // 获取session对象
    HttpSession session = request.getSession();
    User user = (User) session.getAttribute("USER_SESSION");
    // 判断session对象中是否有用户数据，如果有则返回true，放开，继续向下执行
    if (user != null) {
      return true;
    }
    // 其余不满足条件的给出提示信息，并利用转发的方式跳转到登录页面
    request.setAttribute("msg","您还没有登录，请先进行登录");
    request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
    return false;
  }

  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {}

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {}
}
