<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-08
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            +request.getContextPath()
            +"/";
    pageContext.setAttribute("basePath",basePath);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<script type="text/javascript" src="static/jquery-1.7.2.js"></script>
</body>
</html>
