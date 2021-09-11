<%@ page import="ch09_ELAndJSTL.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 郑鑫昌
  Date: 2021-09-07
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("郑鑫昌");
    person.setPhones(new String[]{"13053790930", "110", "120"});
    List<String> cities = new ArrayList<>();
    cities.add("北京");
    cities.add("天津");
    cities.add("上海");
    person.setCities(cities);

    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    map.put("key4", "value4");
    person.setMap(map);

    pageContext.setAttribute("p", person);
%>
输出person ${p}<br/>
输出person的name: ${p.name}<br/>

</body>
</html>
