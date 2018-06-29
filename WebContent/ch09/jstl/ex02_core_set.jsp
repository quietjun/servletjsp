<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*, com.andy.ch09.*"%>
<!DOCTYPE html>
<html>
<head>
<title>set and remove</title>
</head>
<body>
	<c:set var="name" value="andy" scope="request" />
	저장한 \${name } 출력 : ${name }
	<br>
	<c:remove var="name" scope="request" />
	삭제한 \${name } 출력 : ${name }
	<hr>
	<%
		request.setAttribute("name", "andy");
		out.println("name 속성 출력 : " + request.getAttribute("name") + "<br>");
		request.removeAttribute("name");
		out.println("name 속성 출력 : " + request.getAttribute("name") + "<br>");
	%>
	<hr>
	
	<%
		Map<String, String> myMap = new HashMap<String, String>();
		Person p = new Person("henry", 30);
		request.setAttribute("person", p);
	%>
	<c:set target="<%=myMap%>" property="car">winstorm</c:set>
	map의 car property 값 출력 :
	<%=myMap.get("car")%><br>

	<c:set target="${person }" property="name" value="홍길동"></c:set>
	person의 name property 값 출력 :
	<%=p.getName()%><br>

	<c:set target="${person }" property="name" value="홍길동"></c:set>
	person의 name property 값 출력 :
	<%=p.getName()%><br> 
	
	
	deferred expression 용법
	<br>

	<c:set var="myprop" value="<%=myMap%>" />
	<c:set var="weather" value="#{myprop.weather }" />
	weather 정보(설정 이전) \${weather }: ${weather }
	<br>

	<c:set target="${myprop}" property="weather" value="red" />
	weather 정보(설정 이후) \${weather }: ${weather }
</body>
</html>