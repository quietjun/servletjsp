<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
var key = "Vy4971YDIgMFmywWHmPkgSex6ENrqIJLG2VRGHEZ7geY%2BqiSR7qdr7vXoVo20mxV1xIeM49o3WYt4Fft6%2Fg9yg%3D%3D";
	$(document).ready(function() {
		var dropHere = $("#drophere");
		$("#fromFileData").click(function(){
			$.ajax({
				url:"travel.json",
				type:"get",
				dataType:"text",
				success:function(responseTxt, statusTxt, xhr){
					dropHere.html(responseTxt);
				},
				error:function(){}
			});
		});
		
		$("#getOpenData").click(function(){
			dropHere.html("");
			var myUrl = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList";
				myUrl+="?_type=json&MobileOS=ETC&MobileApp=AppTesting&ServiceKey="+key;
				myUrl+="&areaCode=35";
			$.ajax({
				url:myUrl,
				dataType:"json",
				type:"get",
				success:function(responseTxt, statusTxt, xhr){
					var obj = responseTxt;
	 				var itemarr = responseTxt["response"]["body"]["items"]["item"];
					var itemarr = responseTxt.response.body.items.item;
					$.each(itemarr, function(index, item){
						dropHere.append("주소1: "+item.addr1+" , 주소2: "+item.addr2+" : <img src='"+item.firstimage+"'><br>")
					});  
				},
				error:function(xhr, statusTxt, errThrown){
					alert(errThrown);
				}
			
			});
		});
		
		$("#getSoccerNews").click(function(){
			dropHere.html("");
			var link ="https://ajax.googleapis.com/ajax/services/feed/load?v=2.0&num=10&callback=?&q=";
			link+="http://www.senpress.co.kr/rss/allArticle.xml";
			$.ajax({
				url:link,
				dataType:"json",
				success:function(rexponseTxt, statusTxt, xhr){
					var itemarr = rexponseTxt.responseData.feed.entries;
					$.each(itemarr, function(index, item){
						dropHere.append("타이틀: <a href='"+item.link+"'>"+item.title+"</a><br>");
					}); 
				},
				error:function(xhr, statusTxt, errThrown){
					alert("전송 실패");
				},
			});
		});
		
		$("#getData").click(function(){
			dropHere.html("");
			var url = "<%=request.getContextPath()%>/AJaxJSonServlet";
			$.getJSON(url, function(responseTxt, statusTxt, xhr){
				var obj = responseTxt;
				var itemarr = responseTxt.Addresses;
				dropHere.html("");
				$.each(itemarr, function(index, item){
					dropHere.append(item.CustomerName+" : "+item.AccountId+"<br>")
				});
			})
		});
	});
</script>
</head>
<body>
	<h1>한국관광공사 OpenAPI</h1>
	<input type="button" id="fromFileData" value="로컬 파일 로딩" />
	<input type="button" id="getOpenData" value="한국관광공사에 요청" />
	<h1>축구 뉴스 RSS</h1>
	<input type="button" id="getSoccerNews" value="축구뉴스" />
	<h1>localhost 자료 요청</h1>
	<input type="button" id="getData" value="전송" />
	<div id="drophere"></div>
	
</body>
</html>