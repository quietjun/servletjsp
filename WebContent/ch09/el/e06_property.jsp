<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="com.andy.ch09.*"%>
<!DOCTYPE html>
<html>
<head>

<title>java beans 활용</title>
</head>
<%
	Person p = new Person("andy", 20);
	request.setAttribute("person", p);
%>
<body>
	Person's name : ${person.name }, age : ${person.age }<br>
	${person.setName("henry") }
	Person's name : ${person.name }, age : ${person.age }<br>
	Person instance method call : ${person.instanceMethod() } <br>
</body>
</html>