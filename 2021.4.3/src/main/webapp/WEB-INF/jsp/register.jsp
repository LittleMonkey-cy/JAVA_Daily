<%--
  Created by IntelliJ IDEA.
  User: Return of the king
  Date: 2021/4/2
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerCustomer" method="post">
    <%--    name名字要和实体类user中的属性名保持一致--%>
    客户编号：<input type="text" name="custId"><br>
    客户名称：<input type="text" name="custName"><br>
    密码：<input type="password" name="custPassword"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
