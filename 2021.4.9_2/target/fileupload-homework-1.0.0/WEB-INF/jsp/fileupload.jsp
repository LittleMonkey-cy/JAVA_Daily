<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<div id="workspace" style="background-color:pink;width:500px;margin: auto;">
    <div id="register" style="width: 300px; background-color: red;margin: auto;">
        <form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
            <div id="title" style="margin-left: 50px;">
                <h1>用户注册</h1>
            </div>
            <div id="deception" style="background-color: aqua;">
                <div id="circle">
                    <label for="fileupload" id="lab-file">选择头像:<br></label>
                    <input id="fileupload" type="file" name="file"
                           style="width: 100px;height: 100px;border-radius: 50%;background-color: red;background: url('../../images/plus.png');background-size: contain;background-repeat: no-repeat;"/>
                    <br>
                </div>
                <div id="userInfo">
                    <label>用户姓名：
                        <input type="text" placeholder="userName" name="userName"/>
                    </label><br>
                    <label>用户账户：
                        <input type="text" placeholder="userCode" name="userCode"/>
                    </label><br>
                    <label>输入密码：
                        <input type="text" placeholder="Password" name="password"/>
                    </label><br>
                    <label>确认密码：
                        <input type="text" placeholder="userCode" name="pwd"/>
                    </label><br>
                    <label>联系电话：
                        <input type="text" placeholder="phone" name="phone"/>
                    </label><br>
                    <label>用户住址：
                        <input type="text" placeholder="address" name="address"/>
                    </label><br>
                </div>
                <div style="margin: auto;">
                    <input type="submit" value="立即注册" style="margin: auto;"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
