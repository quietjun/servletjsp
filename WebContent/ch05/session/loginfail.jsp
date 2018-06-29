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
		Object msg = request.getAttribute("failMessage");
		if(msg!=null){
			out.println(msg+"<br>");
		}
	%>
	<a href="<%=request.getContextPath() %>/ch05/session/loginform.jsp">다시 하기</a>
</body>
</html>