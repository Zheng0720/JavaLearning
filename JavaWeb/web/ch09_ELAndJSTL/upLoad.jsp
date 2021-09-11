<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-08
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/JavaWeb_war_exploded/upLoadServlet" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username"/><br/>
    头像：<input type="file" name="photo"><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
