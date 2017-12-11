<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2017/12/7
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>
<base href="<%=basePath%>">
<form method="post" action="user/query">
    <input name = "userId"type="text"/>
    <input type="submit" value="查找">
</form>
<a href="user/toAdd">添加用户</a>
<h2>用户信息列表</h2>
<table>
    <thead>
        <tr>
            <th>用户id</th>
            <th>用户名</th>
            <th>用户信息</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="list">
        <tr>
            <td><a href="user/toUpdate/${list.userId }">${list.userId}</a></td>
            <td>${list.userName}</td>
            <td>${list.userRemark}</td>
            <td><a href="user/delete/${list.userId }"> 删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
