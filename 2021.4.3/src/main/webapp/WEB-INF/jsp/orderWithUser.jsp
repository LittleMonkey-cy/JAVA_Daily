<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询页</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/findCustWithUser" method="post">
        客户所属编号：<input type="text" name="custId"><br>
        所属用户：<input type="text" name="user.username"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
