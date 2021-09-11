<%@ page import="java.util.List" %>
<%@ page import="ch08_jsp.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-06
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px red solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px red solid;
        }
    </style>
</head>
<body>
<%--练习二：jsp 输出一个表格，里面有 10 个学生信息--%>
<%
    List<Student> studentList = (List<Student>) request.getAttribute("studentList");
%>
<table>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
    </tr>
<%
    for(Student student:studentList){%>
    <tr>
        <td><%=student.getId()%></td>
        <td><%=student.getName()%></td>
        <td><%=student.getAge()%></td>
        <td><%=student.getPhone()%></td>
    </tr>
    <%} %>
</table>
</body>
</html>
