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
    <form method="post" action="user/add">
        用户id：  <input name="userId" type="text"/></br>
        用户姓名：<input name="userName" type="text"/></br>
        用户说明：<input name="userRemark" type="text"></br>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
