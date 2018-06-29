<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/upload'/>" method="post" enctype="multipart/form-data">
		<input type="file" name="file1">
		<input type="text" name="file1_desc">
		<br>
		<input type="file" name="file2">
		<input type="text" name="file2_desc">
		<br> <img src="" id="preview">
		<input type="submit" value="전송">
	</form>
</body>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
	$("input[type=file]").on("change", function() {
		var reader = new FileReader();
		var file = this.files[0];
		if (file.type.startsWith("image")) {
			$(reader).on("load", function() {
				$("#preview").attr("src", this.result);
			});
			reader.readAsDataURL(file);
		}
	});
</script>
</html>