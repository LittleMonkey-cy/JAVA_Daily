<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="login">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
        function register() {
            window.location.href = './user/register.jsp';
        }
         //setTimeout(register, 3000);
         function checkinput() {
    if (myform.name.value == "") {
        alert("请输入用户名");
        myform.name.focus();
        return false;
    }
    if (myform.pwd.value == "") {
        alert("请输入密码");
        myform.pwd.focus();
        return false;
    }

    if (myform.pwd.value != myform.pwdconfirm.value) {
        alert("你输入的两次密码不一致，请重新输入！");
        myform.pwd.focus();
        return false;
    }

    if (myform.yzm.value == "") {
        alert("请输入验证码");
        myform.yzm.focus();
        return false;
    }
}
    </script>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath}/login" method="post" onsubmit=" return checkinput();">
        <input type="hidden" name="operate" value="login">
        <div id="login-box">
            <h1>Login</h1><span style="color:red;">${msg}</span>
            <div class="form">
                <div class="item">
                    <i class="fa fa-github-alt" style="font-size:24px"></i>
                    <input type="text" name="userCode" placeholder="Username">
                </div>
                <div class="item">
                    <i class="fa fa-search" style="font-size:24px"></i>
                    <input type="password" name="userPassword" placeholder="Password">
                </div>
            </div>
            <input type="submit" class="button"value="Login">
            <br>
            <input type="button" class="button" value="Register" onclick="register()">
        </div>
    </form>
    
  </body>
</html>
