<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-06
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            width: 650px;
        }
    </style>
</head>
<body>
<%--练习一：在 jsp 页面中输出九九乘法口诀表--%>
<table align="center">
    <%for (int i = 1; i <= 9; i++) {%>
    <tr>
        <%for (int j = 1; j <= i; j++) {%>
        <td><%=i + "×" + j + "=" + i * j%></td>
    <%}%>
    </tr>
    <%}%>
</table>

</body>
</html>
