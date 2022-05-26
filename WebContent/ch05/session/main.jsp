<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!
	// cookie 차단 테스트 때문에 추가된 코드
	private String toEncode(HttpServletResponse response, String url) {
		return response.encodeURL(url);
	}
%>
</head>
<body>
	<%=session.getAttribute("id")%>님 반갑습니다.
	<a href="<%=request.getContextPath()%>/sessionLogout">logout</a>
	<hr>
	<h1>상품 선택</h1>
	<form method="get" action="<%=toEncode(response, "addToCart") %>">
		<select name="product">
			<option value="apple">사과</option>
			<option value="orange">오렌지</option>
			<option value="banana">바나나</option>
			<option value="pear">배</option>
		</select> <input type="submit" />
	</form>
	<hr>
	<h2>장바구니 내용</h2>
	<%
		Object cartObj = session.getAttribute("cart");
		if (cartObj != null && cartObj instanceof ArrayList<?>) {
		ArrayList<?> cart = (ArrayList<?>) cartObj;
		for (int i=0; i<cart.size(); i++) {
				out.println(cart.get(i));
			}
		}
	%>
	<a href="<%=request.getContextPath()%>/checkOut">계산</a>
</body>
</html>
