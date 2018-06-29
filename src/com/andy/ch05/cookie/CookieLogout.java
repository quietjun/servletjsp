package com.andy.ch05.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieLogout
 */
@WebServlet("/cookieLogout")
public class CookieLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("loginId", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/ch05/cookie/loginform.jsp");
		dispatcher.forward(request, response);
	}

}
