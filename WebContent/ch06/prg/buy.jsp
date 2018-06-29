<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>forward 처리</h1>
	<form method="post" action="<%=request.getContextPath() %>/forwardBuyServlet">
		구매 상품 : <input type="text" name="product"><br>
		<input type="submit">
	</form>
	<hr>
	<h1>redirect 처리</h1>
	<form method="post" action="<%=request.getContextPath() %>/redirectBuyServlet">
		구매 상품 : <input type="text" name="product"><br>
		<input type="submit">
	</form>
</body>
</html>