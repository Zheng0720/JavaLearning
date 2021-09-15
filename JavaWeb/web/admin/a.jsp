<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-14
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("a.jsp页面执行了");
    Object user = session.getAttribute("user");
    //还没有登录
    if(user==null){
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return;
    }
%>
我是a.jsp文件
</body>
</html>
