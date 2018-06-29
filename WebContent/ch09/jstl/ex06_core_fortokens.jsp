<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		String data = "Hello JSTL world.next step-is url";
	%>
	<c:forTokens var="item" items="<%=data %>" delims=" .-">
		${item }<br>
	</c:forTokens>
</body>
</html>