<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="price" value="1234567890"/>
	<fmt:formatNumber value="${price }" type="number" var="numberType"/>
	<fmt:formatNumber value="${price }" type="percent" var="percentType"  />
	<fmt:formatNumber value="${price }" type="currency" var="currencyType" currencyCode="KRW"/>
	
	기본 데이터 : ${price }<br>
	숫자 데이터 : ${numberType }<br>
	퍼센트 데이터 : ${percentType	 }<br>
	통화 데이터 : ${currencyType }<br>
	
	<fmt:parseNumber value="${numberType }" var="number" />
	다시 숫자로 : ${number }<br>
	<fmt:parseNumber value="${percentType }" type="percent" var="number" />
	다시 숫자로 : ${number }<br>	
	<fmt:parseNumber value="${currencyType}" type="currency" 
	var="number" parseLocale="ko_kr"/>
	다시 숫자로 : ${number }<br>	
	
</body>
</html>