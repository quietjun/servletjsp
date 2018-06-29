<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>[]와 . 의 사용법</title>
</head>
<body>
	<%
		ArrayList<String> items = new ArrayList<String>();
	
		items.add("hello");
		items.add("el");
		request.setAttribute("items", items);
	%>
	리스트의 2번째 아이템은 ? ${items[1]} 입니다.
	<br>
	<%
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("first", 1);
		map.put("third&forth", 3);
		request.setAttribute("myMap", map);
	%>
	map에 first로 등록된 자료는? ${myMap[first] }
	<br> map에 third&forth로 등록된 자료는? ${myMap["third&forth"] }
	<br>
	<%-- map에 third&forth로 등록된 자료는? ${myMap.third&forth }<br> --%>
	map에서 ${param.name }라는 key 로 등록된 자료는 ${myMap[param.name] }
	<br>
</body>
</html>