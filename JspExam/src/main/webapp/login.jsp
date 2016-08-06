<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<script type="text/javascript">
	function check(form) {
		//document.forms.form1.username.value取得form1中Username的值 并判断是否为空
		if (document.forms.LoginForm.username.value == "") {
			//如果 为""则弹出提示
			alert("请输入用户名！");
			//将输入焦点定位到没有输入的地方
			document.forms.LoginForm.username.focus();
			//返回错误
			return false;
		}
		
	}
</script>
</head>
<body>
<form action="CheckName" method="post" name="LoginForm">
 	<table>
 		<tr>
 			<td>用户名：</td>
 			<td><input type="text" name="username"  /></td>
 		</tr>
 		
 		<tr>
 			<td><input type="submit" value="登录" onclick="return check(this);"></td> 			
 		</tr>
 	</table>

 </form>
</body>
</html>