<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="elfunc" uri="com.andy.math_function.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	100과 200 중 큰 수는? ${elfunc:getMax(100, 200) } <br>
	100의 제곱근은? ${elfunc:squareroot(100)} <br>
</body>
</html>

