<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<form method="post" action="<%=request.getContextPath()%>/sessionLogin">
		<label>id : <input type="text" name="id" value="admin"></label><br>
		<label>pass : <input type="text" name="pass" value="1234"></label><br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>