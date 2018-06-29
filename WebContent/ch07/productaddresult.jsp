<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*, com.andy.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>보유 상품 목록</h1>
	<table>
		<jsp:useBean id="productList" scope="request" class="java.util.ArrayList"
			type="java.util.ArrayList<com.andy.entity.Product>" />
		<tr>
			<th>상품코드</th>
			<th>상품명</th>
			<th>가격</th>
			<th>제조사</th>
		</tr>
		<%
			for (Product p : productList) {
		%>
		<tr>
			<td><%=p.getCode()%></td>
			<td><%=p.getName()%></td>
			<td><%=p.getPrice()%></td>
			<td><%=p.getProducer()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<jsp:useBean id="product" class="com.andy.entity.Product"></jsp:useBean>
	<h1>상품 등록</h1>
	<form method="post"
		action="<%=request.getContextPath()%>/ProductListServlet">
		<label for="code">상품코드</label><input type="text" id="code" name="code"><br>
		<label for="name">상품명</label><input type="text" id="code" name="name"><br>
		<label for="price">상품가격</label><input type="text" id="code"
			name="price"><br> <label for="producer">제조사</label><input
			type="text" id="code" name="producer"><br> <input
			type="submit"> <input type="reset">
	</form>
</body>
</html>