package com.andy.ch05.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class CookeeLogin
 */
@WebServlet("/cookieLogin")
public class CookieLogin extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(CookieLogin.class);
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		boolean result = (id != null && id.equals("admin") && pass != null && pass.equals("1234"));
		String target = "/ch05/cookie/loginfail.jsp";
		if (result) {
			Cookie cookie = new Cookie("loginId", URLEncoder.encode(id, "utf-8"));
			cookie.setMaxAge(60);
			response.addCookie(cookie);
			target = "/ch05/cookie/main.jsp";
			request.setAttribute("id", id);
		} else {
			request.setAttribute("failMessage", id + "로는 로그인 할 수 없습니다.");
		}
		logger.trace("나는? " + request.getRequestURI() + " 이동 : " + target);
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

}
