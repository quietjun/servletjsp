<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
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
		Enumeration<String> enume = config.getInitParameterNames();
		while(enume.hasMoreElements()){
			String name = enume.nextElement();
			String value = config.getInitParameter(name);
			out.println("param name : "+name+" , param value: "+value+"<br>");
		}
	%>
</body>
</html>