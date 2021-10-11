<%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-10-11
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick22" method="post" enctype="multipart/form-data">
    名称<input type="text" name="username"><br/>
    文件<input type="file" name="uploadFile" ><br/>
    文件<input type="file" name="uploadFile2" ><br/>
    文件<input type="file" name="uploadFile3" ><br/>
    <input type="submit" name="上传">
</form>
</body>
</html>
