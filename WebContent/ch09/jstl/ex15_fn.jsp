<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str" value="hello,jstl,world" />
	<c:set var="arr" value="${fn:split(str, ',') }" />
	arr의 크기 : ${fn:length(arr) }	<br>

	<c:forEach var="item" items="${arr}">
		${item }<br>
	</c:forEach>
	${fn:substring(str, 1, 2) }	<br>
</body>
</html>