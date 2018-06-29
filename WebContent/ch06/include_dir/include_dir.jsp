<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include test</title>
</head>
<body>
<h1>은서네 집</h1>
<hr>
<%@ include file="/ch06/include_dir/preset.jsp" %>
우리 집은 <%=sinceDate%> 로 부터 있었다.
</body>
</html>