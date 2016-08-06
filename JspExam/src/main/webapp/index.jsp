<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>初始界面</title>
</head>
<body>

<%
	Object obj = session.getAttribute("LoginInfo");
	if(obj != null){
%>
您已经登录，是否要<a href="LogoutServlet">退出</a><br/>

<%}else{%>
您还未登录，请先<a href="login.jsp">登录</a><br/>
<%} %>

<a href="ShowFilm">显示film列表</a><br/>
<a href="addfilm.jsp">新增film列表</a><br/>
<a href="#">删除film列表</a><br/>
<a href="#">编辑film列表</a><br/>
</body>
</html>