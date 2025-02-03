<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>더해볼까?</h1>
	<form method="post" action="./calc">
		<input type="number" name="num1"> + <input type="number" name="num2">=?
		<input type="submit" value="계산">
	</form>
	
	<h2>계산 이력</h2>
	<ul>
	<%
		Cookie [] cookies = request.getCookies();
		if(cookies!=null){
		    for(Cookie c: cookies){
		        if(c.getName().startsWith("calc_")){
		            out.append("<li>"+c.getValue());
		        }
		    }
		}
	%>
	</ul>
</body>
</html>