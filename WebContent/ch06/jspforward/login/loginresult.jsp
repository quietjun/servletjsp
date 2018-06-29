<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward로 이동한 페이지</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
	%>
	<%=id %>님!! 반갑습니다.
</body>
</html>