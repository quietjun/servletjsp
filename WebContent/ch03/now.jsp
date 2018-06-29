<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.Calendar,  java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 표현</title>
</head>
<body>
	<%!// member method
	private String getFormatted(Calendar c) {
		return String.format("오늘은 : %1$tY - %<tm - %<td (%<ta)", c);
	}%>
	<%
		Calendar today = Calendar.getInstance();
		out.println("오늘의 날짜는 : " + today.get(Calendar.DATE));
	%>
	<br>

	<%-- 주석 내용 : <%=c.get(Calendar.DAY_OF_MONTH) %> --%>

	<%
		String formatted = getFormatted(today);
	%>
	<!-- 오늘 날짜는 -->
	expression을 이용한 출력 : <%=formatted%>
</body>
</html>
