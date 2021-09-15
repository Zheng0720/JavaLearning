<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-14
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是登录页面login.jsp<br/>
<form action="http://localhost:8080/JavaWeb_war_exploded/ch11_login" method="get">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/>
    <input type="submit">
</form>
</body>
</html>
