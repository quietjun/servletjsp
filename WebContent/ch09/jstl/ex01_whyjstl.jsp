<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*, com.andy.ch09.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>JSTL Usage</title>
</head>
<body>
	<%
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("andy", 30));
		persons.add(new Person("henry", 20));
		persons.add(new Person("anna", 8));
		request.setAttribute("persons", persons);
	%>
	<h1>사용자 목록 조회</h1>
	<%
		Object obj = request.getAttribute("persons");
		if (obj != null && obj instanceof ArrayList) {
			ArrayList<Person> personsAttr = (ArrayList<Person>) obj;
	%>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<%
			for (int i = 0; i < personsAttr.size(); i++) {
					Person p = personsAttr.get(i);
		%>
		<tr>
			<td><%=p.getName()%></td>
			<td><%=p.getAge()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	persons를 넘겨받지 못했습니다.
	<%
		}
	%>
	<hr>
	<h1>JSTL사용</h1>
	${persons }

	<c:if test="${!empty (persons)}">
		<table border="1">
			<tr>
				<th>이름</th>
				<th>나이</th>
			</tr>
			<c:forEach var="person" items="${persons}">
				<tr>
					<td>${person.name}</td>
					<td>${person.age }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${empty (persons)}">
		persons 를 넘겨받지 못했습니다.
	</c:if>
</body>
</html>