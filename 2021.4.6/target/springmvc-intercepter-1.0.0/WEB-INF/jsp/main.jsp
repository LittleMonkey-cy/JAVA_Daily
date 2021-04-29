<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
当前用户:${USER_SESSION.userCode}
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
