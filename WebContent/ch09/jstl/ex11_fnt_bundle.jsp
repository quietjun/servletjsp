<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bundle test</title>
</head>
<body>
	<fmt:setLocale value="ko" />
	<fmt:bundle basename="messages.message">
		<h1>
			<fmt:message key="title"></fmt:message>
		</h1>
		<fmt:message key="name" /> : 홍길동<br>
		<fmt:message key="age" /> : 30<br>
		<fmt:message key="welcome" /> : 
		<fmt:message key="withparam">
			<fmt:param value="andy"></fmt:param>
			<fmt:param value="seoul"></fmt:param>
		</fmt:message>
		<br>
	</fmt:bundle>
</body>
</html>