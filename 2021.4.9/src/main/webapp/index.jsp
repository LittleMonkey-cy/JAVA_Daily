<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
   上传人： <input type="text" name="name"><br>
    上传文件<input type="file" id="file" name="uploadFile"><br>
    <input type="submit" value="upload">
</form>
</body>
</html>
