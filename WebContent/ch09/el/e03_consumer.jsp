<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	request : ${req}<br>
	session : ${ses}<br>
	application : ${app }<br>
	
	parameter - id : ${param.id }<br>
	선택된 동물 : 
	${paramValues.animal[0]}<br>
	${paramValues.animal[1]}<br>
	${paramValues.animal[2]}<br>
	<hr>
	요청 URL : ${pageContext.request.requestURL }
</body>
</html>