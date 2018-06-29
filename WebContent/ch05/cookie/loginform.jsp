<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>로그인</h1>
	<form method="post" action="<%=request.getContextPath() %>/cookieLogin">
		<label>id : <input type="text" name="id"></label><br>
		<label>pass : <input type="text" name="pass"></label><br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>