<body>
<%
    request.setAttribute("key", "值");
%>
表达式脚本输出 key 的值是：
<%=request.getAttribute("key1") == null ? "" : request.getAttribute("key1")%><br/>
EL 表达式输出 key 的值是：${key1}
</body>