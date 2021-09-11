<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-07
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="10" var="i">
    ${i}
</c:forEach>
<br/>
<%
    request.setAttribute("arr",new String[]{"123","1111","110","119"});
%>
<c:forEach items="${requestScope.arr}" var="item">
    ${item}
</c:forEach>


</body>
</html>
