<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<%
	request.setAttribute("gender", "male");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${"10"+1} : ${"10"+1}<br>
	\${"10"+"1"} : ${"10"+"1"}<br>
	\${"a"+"b"} : ${"a"+"b"}<br>
	\${5+2} : ${5+2}<br>
	\${5/2} : ${5/2}<br>
	\${5>2} : ${5>2}<br>
	\${(5>2) || (2<10)} :  ${(5>2) || (2<10)}<br>
	\${gender=="male" } : ${gender=="male"}<br>
	<!-- 동작은 잘 되나 eclipse explorer에서 오류로 처리함 -->
	<%-- \${"CAT">"DOG" } : ${"CAT"<"DOG" }<br> --%>
	\${ empty param.ID ? "guest" : param.ID } : 안녕하세요. ${ empty param.ID ? "guest" : param.ID }님<br>
	\${ !empty param.ID ? "guest" : param.ID } : 안녕하세요. ${ !empty param.ID ? "guest" : param.ID }님<br>
</body>
</html>