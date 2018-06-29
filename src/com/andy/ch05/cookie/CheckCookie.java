package com.andy.ch05.cookie;

import java.io.IOException;

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
 * Servlet implementation class CookieLogin
 */
@WebServlet(urlPatterns = { "/checkCookie" })
public class CheckCookie extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(CheckCookie.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String loginId = null;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("loginId")) {
					loginId = cookie.getValue();
					break;
				}
			}
		}
		String target = "/ch05/cookie/loginform.jsp";
		if (loginId != null) {
			logger.trace("cookie 존재 :" + loginId);
			request.setAttribute("id", loginId);
			target = "/ch05/cookie/main.jsp";
		}
		logger.trace("나는? " + request.getRequestURI() + " 이동 : " + target);
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}
}
