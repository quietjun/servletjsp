<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.* " %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%=new Date() %>" />
	<fmt:formatDate value="${now }" type="date" dateStyle="long"/><br>
	<fmt:formatDate value="${now }" type="date" dateStyle="short" var="sdate"/><br>
	<fmt:formatDate value="${now }" type="time" pattern="hh:MM:ss"/><br>
	이젠 문자 : ${sdate }<br>
	<fmt:parseDate value="${sdate }" pattern="yy.mm.dd" var="date"/>
	다시 날짜 객체 : ${date }
</body>
</html>