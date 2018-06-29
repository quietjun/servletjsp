<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar c = Calendar.getInstance();
		//c.setTime(current_time);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		String forwardpage = "";
		if(hour>9){
			forwardpage = "/view/goodmorning.jsp";
		}else if(hour>18){
			forwardpage = "/view/goodafternoon.jsp";
		}else{
			forwardpage = "/view/goodevening.jsp";
		}
	%>
	<jsp:forward page="<%=forwardpage %>" />
</body>
</html>