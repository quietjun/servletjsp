<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="com.andy.entity.*, com.andy.ch07.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--parameter로 넘어온 정보를 useBean을 이용해 바로 bean에 매핑 --%>
<jsp:useBean id="product" class="com.andy.entity.Product" scope="request">
	<jsp:setProperty name="product" property="*"/>
</jsp:useBean>

<%
	ProductService service = ProductService.getInstance();
	service.addProduct(product);
	// 저장 후 상품 목록을 request 영역에 저장
	request.setAttribute("productList", service.getAllProducts());
%>
<jsp:forward page="productmanage.jsp"></jsp:forward>
</body>
</html>