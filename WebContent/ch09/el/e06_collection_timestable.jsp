<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>

<title>[]와 , 의 사용법</title>
</head>
<body>
	<%
		ArrayList<Map<Integer, Integer>> timestable = new ArrayList<>();
		for(int i=1; i<10; i++){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int j=1; j<10; j++){
				map.put(j, i*j);
			}
			timestable.add(map);
		}
		request.setAttribute("timestable", timestable);
		out.println(timestable);
	%>
	<h1>당신이 알고 싶은 단은? ${param.dan }</h1>
	${timestable[param.dan-1] }
	<%-- ArrayIndex 항목은 숫자형 문자나 숫자로 모두 사용 가능--%>
	${param.dan} * 7= ${timestable[param.dan-1]["7"]}<br>
	5 * 8 = ${timestable["4"]["8"]}<br>
	<%-- map의 key 값에는 형 변환이 이뤄지지 않음--%>
	map의 key에 숫자 전달 : ${timestable[param.dan+1][8]}<br>
</body>
</html>