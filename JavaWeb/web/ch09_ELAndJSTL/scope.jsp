<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-07
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key1","pageContext1");
    pageContext.setAttribute("key2","pageContext2");
%>
${pageScope.key1}
</body>
</html>
