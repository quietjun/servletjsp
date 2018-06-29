<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		// Service를 통해 DB 다녀 옴.
		boolean canLogin = id!=null && id.length()>0;
		String target = "login.html";
		if(canLogin){
			target = "loginresult.jsp";
		}
	%>
	전달 준비.
	<jsp:forward page="<%=target %>">
		<jsp:param name="id" value="<%=id %>"/>
	</jsp:forward>
	전달 완료!
</body>
</html>