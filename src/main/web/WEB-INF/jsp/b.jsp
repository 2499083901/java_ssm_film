<%@page import="com.etc.po.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>b</h1>
	<h2>username:${user.userName }</h2>
	<h2>password:${user.passWord }</h2>
	<h2>说明这是这个存在request当中的</h2>
	<h3>username:<%=((User)request.getAttribute("user")).getUserName() %></h3>
	
	<h2>展示时间</h2>
	<h3>${user.birthday }</h3>
</body>
</html>