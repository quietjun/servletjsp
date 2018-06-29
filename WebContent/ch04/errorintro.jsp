<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="problem.jsp">null pointer 페이지로 gogo</a><br>
	<a href="hello.jsp">web.xml의 없는 페이지 처리로 gogo</a><br>
	<a href="arrayindex.jsp">web.xml의 예외 타입별 처리로 gogo</a><br>
	<a href="arichmetic.jsp">이도 저도 아닌 상황은? default 처리</a><br><br>
	

	<a href="/ServletJsp/ProblemServlet?errortype=code">코드 기반 에러 처리</a><br>
	<a href="/ServletJsp/ProblemServlet?errortype=type">타입 기반 에러 처리</a><br>
	<a href="/ServletJsp/ProblemServlet?errortype=other">xml에 정의되지 않은 코드</a><br>
	<a href="/ServletJsp/ProblemServlet">servlet에서 null 처리 페이지 호출?</a><br>
</body>
</html>
