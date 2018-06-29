<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>core forEach</title>
</head>
<body>
	<c:forEach var="i" begin="0" end="10" step="2">
		<c:set var="sum" value="${sum +i}"></c:set>
	</c:forEach>
	0부터 10까지 짝수의 합 결과 : ${sum }
	<br>

	<%
		String[] strings = { "Hello", "JSTL", "World" };
	%>

	<c:forEach var="item" items="<%=strings%>">
		${item }<br>
	</c:forEach>
	<%
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "andy");
		map.put("age", "20");
		request.setAttribute("person", map);
	%>
	map에서의 데이터 추출
	<br>
	<c:forEach var="data" items="${person }" varStatus="status">
		${status.index}번째 요소 : ${data.key}, ${data.value}<br>
	</c:forEach>

	<table>
		<tr>
			<th>first</th>
			<th>second</th>
			<th>result</th>
		</tr>
		<c:forEach var="i" begin="1" end="9">
			<tr>
				<td>${ param.dan}</td>
				<td>${i }</td>
				<td>${i * param.dan}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>