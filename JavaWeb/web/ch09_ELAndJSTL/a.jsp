<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-06
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  request.setAttribute("key","value");
%>
表达式脚本输出key的值是：<%=request.getAttribute("key")%>
<br/>
EL表达式输出key的值是: ${key};

</body>
</html>
