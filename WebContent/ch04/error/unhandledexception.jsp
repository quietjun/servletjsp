<%@ page language="java" contentType="text/html; charset=UTF-8"
	isErrorPage="true"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	response.setStatus(200);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	미처 처리 못한 exception이 있군요. 죄송합니다.
	<br>
	<%=exception%>
</body>
</html>