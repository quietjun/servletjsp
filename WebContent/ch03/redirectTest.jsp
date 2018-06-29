<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar c = Calendar.getInstance();
		int sec = c.get(Calendar.SECOND);
		boolean side = sec % 2 == 0;
		System.out.println(sec);
 		if (side) {
			response.sendRedirect("http://www.google.com");
		} else {
			response.sendRedirect("http://www.naver.com");
		}
	%>
</body>
</html>