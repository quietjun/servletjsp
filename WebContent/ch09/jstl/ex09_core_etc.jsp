<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	c:out test<br>
	<%
		BufferedReader reader = null;
		try {

			String path = "/WEB-INF/web.xml";
			reader = new BufferedReader(new InputStreamReader(application.getResourceAsStream(path), "utf-8"));
	%>
	<pre>
	<c:out value="<%=reader%>" escapeXml="true" />
	</pre>
	<%
		} finally {
			reader.close();
		}
	%>
	c:catch test<br>
	<c:catch var="e">
		<%
			Object obj = null;
			out.println(obj.toString());
		%>
	</c:catch>
	
	${e }
</body>
</html>