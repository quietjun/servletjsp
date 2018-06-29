<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구매완료</title>
</head>
<body>
	<%
		Object prodObj = request.getAttribute("product");
	%>
	<%=prodObj %>를 구매해주셔서 감사합니다.
</body>
</html>