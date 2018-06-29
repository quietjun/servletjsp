package com.andy.ch05.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyCookie
 */
@WebServlet("/cookiemaker")
public class CookieMaker extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		Cookie cookie = new Cookie("user", "andy");
		cookie.setMaxAge(60 * 1);
		// cookie.setDomain(".andy.com");
		response.addCookie(cookie);
		
		// session 처럼 존재하는 쿠키
		Cookie cookie2 = new Cookie("user2", URLEncoder.encode("은서파", "utf-8"));
		cookie2.setMaxAge(-1);
		response.addCookie(cookie2);
		
		// 의미 없는 쿠키
		Cookie cookie3 = new Cookie("phone", "010-0000-0000");
		cookie3.setMaxAge(0);
		response.addCookie(cookie3);

		String target = "/ch05/cookie/cookieconsumer.jsp";
		response.sendRedirect(request.getContextPath()+target);
	}

}
