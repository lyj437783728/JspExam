<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的film</title>
<script type="text/javascript">
	function check(form) {
		//document.forms.form1.username.value取得form1中Username的值 并判断是否为空
		if (document.forms.addForm.title.value == "") {
			//如果 为""则弹出提示
			alert("请输入标题！");
			//将输入焦点定位到没有输入的地方
			document.forms.addForm.title.focus();
			//返回错误
			return false;
		}
		if (document.forms.addForm.language.value == "") {
			//如果 为""则弹出提示
			alert("请选择语言！");
			
			//返回错误
			return false;
		}
		
	}
</script>
</head>
<body>
输入必要的数据，用于添加新的film：<br/>
	<form method="post" action="AddFilm" name="addForm">
		<table>
			<tr>
				<td>title:</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>description:</td>
				<td><input type="text"  style=”width:100px; height:200px;” name="description" /></td>
			</tr>
			<tr>
				<td>language:</td>
				<td><select name="language">
						<option value="1" selected="">English</option>
						<option value="2">Italian</option>
						<option value="3">Japanese</option>
						<option value="4">Mandarin</option>
						<option value="5">French</option>
						<option value="6">German</option>
				</select></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="添加" onclick="return check(this);">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>