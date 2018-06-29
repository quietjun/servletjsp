<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	header 정보 표시 1: ${header["User-Agent"]}<br>
		header 정보 표시 2: ${header["User_Agent"]}<br>
	header 정보 표시 : ${header["accept-language"]}<br>
	<hr>
	cookie 정보 표시 : ${cookie.JSESSIONID.value}<br>
	값을 얻기 위해서는  ${cookie["JSESSIONID"]["value"]};
	
	<hr>
	요청 URL : ${pageContext["request"]["requestURL"]}<br>
</body>
</html>