<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>c if</title>
</head>
<body>
	<%
		int age = 10;
		request.setAttribute("name", "andy");
	%>
	<c:if test="true">
		<h1>타이틀은 언제나 나와야지.</h1>
	</c:if>

	<c:if test="${!empty name }">
		name attribute가 있으면 출력해줘요.<br>
	</c:if>
	<c:if test="<%=age > 5%>" var="result">
		age가 5 보다는 크군요 <%=age%><br>
	</c:if>
	${result }

	<%
		session.setAttribute("loginId", "hong");
	%>
	<h1>main page</h1>
	<c:if test="${!empty loginId }" var="result">
		${loginId }님 반갑습니다.!!
	</c:if>
	<c:if test="${!result }">
		로그인 : <input type="text">
	</c:if>
</body>
</html>