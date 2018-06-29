<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="ch05/template/template.css">
<title>Insert title here</title>
</head>
<body>
	<%
		Object contentPageObj = request.getAttribute("content_page");
		String content = contentPageObj == null ? "default.jsp"
				: contentPageObj.toString();
	%>
	<header>
		<jsp:include page="header.jsp"></jsp:include>
	</header>
	<article id="main_article">
		<section>
			<jsp:include page="left.jsp"></jsp:include>
		</section>
		<section>
			<jsp:include page="<%=content%>"></jsp:include>
		</section>
	</article>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>
</html>