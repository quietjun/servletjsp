<%@ page language="java" contentType="text/html; charset=UTF-8"
	isErrorPage="true"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory" %>
<!DOCTYPE html>
<%!
	private static final Logger logger = LoggerFactory.getLogger("ehandler.jsp");
%>
<%

	response.setStatus(200);
%>
<html>
<head>
<meta charset="UTF-8">
<title>서버 오류 발생</title>
</head>
<body>
앗!!!
<hr>
서버단에서 먼가 큰일이 났습니다.<%=exception %>
<hr>
	요청 URL: <%=pageContext.getErrorData().getRequestURI() %><br>
	상태 코드: <%=pageContext.getErrorData().getStatusCode() %><br>
	<br>
	<%
		logger.error("예외 처리", exception);
	%>
</body>
</html>