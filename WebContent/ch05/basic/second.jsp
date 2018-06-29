<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>second jsp</h1>
	param data :  <%=request.getParameter("param") %><br>
	request date :  <%=request.getAttribute("reqDate") %><br>
	session date :  <%=session.getAttribute("sesDate") %><br>
	application date :  <%=application.getAttribute("appDate") %><br>
	<hr>	
	
</body>
</html>