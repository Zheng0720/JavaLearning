<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-07
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
保存之前${requestScope.abc}<br/>
<c:set scope="request" var="abc" value="abcValue"/>
保存之后${requestScope.abc}<br/>

<hr>
<c:if test="${12==12}">
    <h1>12=12</h1>
</c:if>
<%
    request.setAttribute("height", 178);
%>
<c:choose>
    <c:when test="${requestScope.height>190}">
        <h2>小巨人</h2>
    </c:when>
    <c:when test="${requestScope.height>180}">
        <h2>很高</h2>
    </c:when>
    <c:when test="${requestScope.height>170}">
        <h2>还可以</h2>
    </c:when>
    <c:otherwise>
        <h2>小矮子</h2>
    </c:otherwise>

</c:choose>
</body>
</html>
