<%@ page language="java" import="java.util.*,com.lyj.bean.Film" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>film信息展示</title>
</head>
<body>
<%
	ArrayList al= (ArrayList)request.getAttribute("FilmInfo");
%>
<center>

<table border="1">
<tr>
<td>film_id</td><td>title</td><td>description</td><td>language</td><td>delete</td><td>update</td>
</tr>
<% for(int i=0;i<al.size();i++){
	Film film = (Film)al.get(i);
%>
<tr>
<td><%=film.getFilm_id() %></td><td><%=film.getTitle() %></td><td><%=film.getDescription() %></td><td><%=film.getLanguage() %></td>
<td><a href="#">删除</a></td>
<td><a href="EditFilmServlet?id=<%=film.getFilm_id() %>&title=<%=film.getTitle() %>&description=<%=film.getDescription() %>&language=<%=film.getLanguage() %>">修改</a></td>
</tr>

<%} %>
</table>

</center>

</body>
</html>