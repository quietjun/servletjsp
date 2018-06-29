<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		Enumeration<String> enume = request.getHeaderNames();
		while (enume.hasMoreElements()) {
			String hName = enume.nextElement();
			out.println("header name : " + hName + "<br>");
			out.println("&nbsp;&nbsp;" + request.getHeader(hName) + "<br>");
		}
	%>
</body>
</html>