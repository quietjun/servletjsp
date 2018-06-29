<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session consumer</title>
<%!
	private String getDate(long time){
		String date = String.format("%ty-%<tm-%<td %<tH:%<tM:%<tS", time);	
		return date;
	}
%>
</head>
<body>
	<h1>session 정보 출력</h1>
	session 생성 시각 : <%= getDate(session.getCreationTime()) %><br>
	최종 접속 시각 : <%= getDate(session.getLastAccessedTime()) %><br>
	session id : <%=session.getId() %><br>
	전체 session attribute 출력<br>
	<%
		Enumeration<String> enume = session.getAttributeNames();
		while(enume.hasMoreElements()){
			String name = enume.nextElement();
			out.println(name+" : "+session.getAttribute(name)+"<br>");
		}
	%>
</body>
</html>