<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendRedirect와 forward</title>
</head>
<body>
	<h1>SendRedirect vs Forward</h1>
	결과 출력<br>
	이름 : <%=request.getParameter("name") %><br>
	전화 : <%=request.getParameter("phone") %><br>
	<a href="/ServletJsp/ch06/forward/redirvsforward/redirvsforwardintro.html">다시 테스트</a>
</body>
</html>