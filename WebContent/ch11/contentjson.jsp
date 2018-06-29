<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>서버에서 받은 데이터</h1>
	<ul id="fromServer">
		
	</ul>
	<button id="get">조회</button>
	<button id="send">전송</button>
</body>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function(){
		$("#send").on("click", function(){
			var url = "<%=request.getContextPath()%>/JsonServlet";
			var user = {"id":"hong",name:"홍길동",pass:"1234"};
			var data = {data:JSON.stringify(user)};
			$.ajax({
				url:url,
				success:function(txt){
					console.log("전송 완료");
				},
				method:"post",
				data:data,
				"Content-Type":"application/x-www-form-urlencoded;charset=utf-8"
			});
		});
		
		$("#get").on("click", function(){
			var url = "<%=request.getContextPath()%>/JsonServlet";
			$.ajax({
				url:url,
				success:function(txt){
					var $target = $("#fromServer");
					$target.append("<li>"+txt["name"]+"</li>");
					console.log(JSON.stringify(txt));
					console.log(txt["id"]+" : "+txt["name"]);
				},
				method:"get",
			});
		});
	});

</script>
</html>











