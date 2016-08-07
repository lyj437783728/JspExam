<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑界面</title>
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
	<form method="post" action="UpdateFilmServlet" name="addForm">
	    <input type="hidden" name="film_id" value="${id}" />
		<table>
			<tr>
				<td>title:</td>
				<td><input type="text" name="title" value="${title}" /></td>
			</tr>
			<tr>
				<td>description:</td>
				<td><input type="text" name="description" value="${description}" /></td>
			</tr>
			<tr>
				<td>language:</td>
				<td><select name="language" >
						<option value="1" <#if language == "English">selected</#if>>English</option>
						<option value="2" <#if language == "Italian">selected</#if>>Italian</option>
						<option value="3" <#if language == "Japanese">selected</#if>>Japanese</option>
						<option value="4" <#if language == "Mandarin">selected</#if>>Mandarin</option>
						<option value="5" <#if language == "French">selected</#if>>French</option>
						<option value="6" <#if language == "German">selected</#if>>German</option>
				</select></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="修改" onclick="return check(this);">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>