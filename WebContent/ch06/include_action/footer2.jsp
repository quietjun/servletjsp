<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<nav>
	<ul>
		<li><a href="#">andy.com 이란?</a></li>
		<li><a href="#">naver</a></li>
		<li><a href="#">google</a></li>
		<li><a href="#">naver</a></li>
	</ul>
	연락처: 이메일 <%=request.getParameter("email") %>, 전화 <%=request.getParameter("tel") %>
</nav>
명시적으로 전달 받지 않은 parameter <%=request.getParameter("type")%><br>
attribute <%=request.getAttribute("attr") %>
