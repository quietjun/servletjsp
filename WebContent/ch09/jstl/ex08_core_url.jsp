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
	<c:url value="http://search.daum.net/search" var="searchUrl">
		<c:param name="w" value="blog"/>
	</c:url>
	
	${searchUrl }<br>
	
	<a href="<%=request.getContextPath() %>/ch09/jstl/ex01_whyjstl.jsp">why jstl?</a><br>
	
	
	<c:url value="/ch09/jstl/ex01_whyjstl.jsp" var="why"/>
	<a href="${why }">why jstl?</a><br>
	
	${why }<br>
	
	<c:url value="./ex02_core_set.jsp" var="set"/>
	${set}<br>	
	<a href="${set }">why jstl?</a><br>
</body>
</html>

