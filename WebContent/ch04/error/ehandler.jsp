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
<title>에러페이지</title>
</head>
<body>
	이용에 불편을 드려 대단히 죄송합니다.<br> 
	게속 그러면 담당자(국번없이 110)에게 연락 주세요.<br>
	요청 URL: <%=pageContext.getErrorData().getRequestURI() %><br>
	상태 코드: <%=pageContext.getErrorData().getStatusCode() %><br>
	<br>
	<%
		logger.error("예외 처리", exception);
	%>
</body>
</html>