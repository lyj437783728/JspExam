<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的film</title>
</head>
<body>
输入必要的数据，用于添加新的film：<br/>
	<form>
		<table>
			<tr>
				<td>title:</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>description:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td>language:</td>
				<td><select name="language">
						<option value="1" selected="">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
				</select></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="添加">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>