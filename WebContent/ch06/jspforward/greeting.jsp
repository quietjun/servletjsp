<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar cal = GregorianCalendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		String target = "";
		if(hour>9 && hour <=12){
			target = "goodmorning.jsp";
		}else if(hour>12 && hour<=18){
			target = "goodafternoon.jsp";
		}else{
			target = "goodevening.jsp";
		}
	%>
	<jsp:forward page="<%=target %>"></jsp:forward>
</body>
</html>