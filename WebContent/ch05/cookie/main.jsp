<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getAttribute("id") %>님 반갑습니다.
	<a href="<%=request.getContextPath() %>/cookieLogout">logout</a>
</body>
</html>