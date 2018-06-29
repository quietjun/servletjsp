<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 정보 출력</title>
</head>
<body>
	<h1>쿠키 정보 출력</h1>
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
		System.out.println(cookies.length);
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				out.println("쿠키 명 : " + cookie.getName() + "<br>");
				out.println("값 : " + URLDecoder.decode(cookie.getValue(), "utf-8") + "<br>");
			}
		}
	%>
</body>
</html>