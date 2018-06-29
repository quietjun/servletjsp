<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int dan = 5;
	%>
	times table for
	<%=dan%>
	<table border="1">
		<tr>
			<th>first num</th>
			<th>second num</th>
			<th>result</th>
		</tr>
		<%
			for (int i = 1; i < 10; i++) {
		%>
		<tr>
			<th><%=i%></th>
			<th><%=dan%></th>
			<th><%=dan * i%></th>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>