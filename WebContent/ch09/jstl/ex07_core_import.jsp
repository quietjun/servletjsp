<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.site=='youtube' }" >
			<c:import url="http://www.youtube.com/results" var="site"/>
		</c:when>
		<c:otherwise>
			<c:import url="ex01_whyjstl.jsp" var="site"/>
		</c:otherwise>
	</c:choose>
	필요한 위치에 삽입 가능 ${site }
</body>
</html>