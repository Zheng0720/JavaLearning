<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-10-08
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">
    <%--表明是第一个user对象的username和age--%>
    <input type="text" name="userList[0].name"><br />
    <input type="text" name="userList[0].age"><br />
    <input type="text" name="userList[1].name"><br />
    <input type="text" name="userList[1].age"><br />
    <input type="submit" name="提交"/>
</form>
</body>
</html>
