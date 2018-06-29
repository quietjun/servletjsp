<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page errorPage="error/nullhandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 발생 페이지</title>
</head>
<body>
<%
	Object obj = null;
	obj.toString();
%>
</body>
</html>
