<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="com.andy.ch09.Person"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>expression tag and EL</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>

</head>
<%
	Person p = new Person("andy", 20);
	request.setAttribute("person", p);
%>
<body>
	expression tag 사용 시
	<br>
	<%
		Person attrp = (Person) request.getAttribute("person");
	%>
	<%=attrp.getName()%><br> el 사용 시
	<br> ${person.name }
	<br>

	<%
		int result = 0;

		for (int i = 0; i < 100; i++) {
			result += i;
		}
		request.setAttribute("sum", result);
	%>
	expression tag의 출력 :<%=result%><br> expression language 출력 : ${sum }
</body>
<script>
	$(function(){
		<%-- alert("Hello"+ <%=p.getName()%>); --%>
		alert("Hello"+ "<%=p.getName()%>");

		/* //alert("Hello" + ${person.name }); */
		alert("Hello" + "${person.name }");
	});
</script>
</html>


