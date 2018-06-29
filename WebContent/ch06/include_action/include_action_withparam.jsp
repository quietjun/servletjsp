<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include action test</title>
</head>
<body>
	<header>
		<h1>include test</h1>
	</header>

	<hr>
	<section>
		<article>param 태그를 이용해서 include되는 페이지에 자료 전달</article>
		<%
			request.setAttribute("attr", "request에 담긴 attribute");
		%>
		<%=request.getParameter("type") %><br>
		<footer>
			<jsp:include page="footer2.jsp">
				<jsp:param name="email" value="abc@def.com" />
				<jsp:param name="tel" value="010-0000-0000" />
			</jsp:include>
		</footer>
		
		target에 넘겨준 param? <%=request.getParameter("email") %>
	</section>

</body>
</html>
