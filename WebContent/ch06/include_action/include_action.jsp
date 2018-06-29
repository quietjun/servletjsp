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
	<section>
		<article>include action tag : 다른 jsp file을 런타임에 포함시킴</article>
		<footer>
			<jsp:include page="footer.jsp"></jsp:include>
		</footer>
	</section>
</body>
</html>
