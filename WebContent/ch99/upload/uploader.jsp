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
	<form action="<%=request.getContextPath()%>/Upload">
		<label for="name">이름</label><input type="text" name="name" id="name"><br>
		<label for="file">파일</label><input type="file" name="file" id="file" multiple="multiple"><br>
		<input type="submit" formmethod="post" value="upload" formenctype="multipart/form-data">
	</form>
</body>
</html>