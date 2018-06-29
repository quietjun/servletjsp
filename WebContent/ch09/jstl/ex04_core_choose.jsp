<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>core choose when otherwise</title>
</head>
<body>
	<%
		int age = 17;
	%>
	<c:choose>
		<c:when test="<%=(age > 18)%>">성인</c:when>
		<c:when test="<%=(age > 10)%>">미성인</c:when>
		<c:otherwise>유아</c:otherwise>
	</c:choose>

	<%
		request.setAttribute("loginId", "hong");
	%>
	<c:choose>
		<c:when test="${empty loginId }">
			login 해주세요.
		</c:when>
		<c:when test="${!empty loginId && loginId=='admin' }">
			관리자를 위한 메뉴를 보여주자!!
		</c:when>
		<c:otherwise>
			${loginId }님 반갑습니다.
		</c:otherwise>
	</c:choose>
	
</body>
</html>