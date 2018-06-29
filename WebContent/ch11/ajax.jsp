<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	window.onload=function(){
		var xhr = new XMLHttpRequest();
		setInterval(function(){
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4 && xhr.status==200){
					document.querySelector("#reply").innerHTML+="<li>"+xhr.responseText+"</li>";	
				}
			}
			var url = "<%=request.getContextPath()%>/AJaxServlet?type=한글";
			xhr.open("get", url, true);
			xhr.send();
			},1000*10);// send
		
		$("#send").click(function(){
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4 && xhr.status==200){
					document.querySelector("#reply").innerHTML+="<li>"+xhr.responseText+"</li>";	
				}
			}
			var url = "<%=request.getContextPath()%>/AJaxServlet";
			xhr.open("post", url, true);
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			xhr.send("message="+document.querySelector("#message").value);
			});// send			
		};
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