<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		<c:url value="/AJaxServlet" var="url"/>
		setInterval(function(){			
			$.get("${url}","type=한글", function(resText, statusText, xhr){
				if(statusText=="success"){
					$("#reply").html($("#reply").html()+"<li>"+resText+"</li>")
				}else{
					alert("data loading 실패");
				}
			})
		}, 100000);// send
		
		$("#send").click(function(){
			<c:url value="/AJaxServlet" var="url"/>
			var myData = {message:$("#message").val()};
			$.ajax({
				url:"${url}",
				type:"post",
				data:myData,
				success:function(rexponseTxt, statusTxt, xhr){
					alert("전송 완료");
				},
				error:function(xhr, statusTxt, errThrown){
					alert("전송 실패");
				},
				complete:function(){
					alert("ajax method over");
				}				
			});
		});
	});
</script>
</head>
<body>
<h1>머시기가 거시기 했데요..</h1>
세상 머시기거 거시기를 했답니다. 어떻게 이런 일이 가능할까요?
<hr>
<h3>네티즌 와글 와글</h3>
<ul id="reply">
</ul>
<h3>댓글 달기</h3><br>
<label for="message">댓글</label>
<textarea rows="3" cols="100" id="message"></textarea>
<input type="button" id="send" value="전송"/>
</body>
</html>