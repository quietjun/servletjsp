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
<title>404에러 발생</title>
</head>
<body>
앗!!!
<hr>
요청하신 페이지를 찾을 수 없습니다. 혹시 오타 아닌가요?<%=exception %>
<hr>
	요청 URL: <%=pageContext.getErrorData().getRequestURI() %><br>
	요청 URL: <%=pageContext.getErrorData().getServletName() %><br>
	상태 코드: <%=pageContext.getErrorData().getStatusCode() %><br>
	<br>
	<%
		logger.error("예외 처리", exception);
	%>
</body>
</html>