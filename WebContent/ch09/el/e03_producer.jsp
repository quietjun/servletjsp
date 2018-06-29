<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("req", "hong");
		session.setAttribute("ses", "홍길동");
		application.setAttribute("app", 30);
	%>
	<form action="e03_consumer.jsp">
		<label for="id">아이디</label>
		<input type="text" id="id" name="id"><br>
		다음 중 키우는 애완 동물을 선택하세요? <br>
		<select multiple="multiple" name="animal" size="3">
			<option>고양이
			<option>강아지
			<option>거북이
			<option>물고기
			<option>이구아나
		</select>
		<input type="submit">
	</form>

</body>
</html>