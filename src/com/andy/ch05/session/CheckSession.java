package com.andy.ch05.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class CookieLogin
 */
@WebServlet(urlPatterns = { "/checkSession" })
public class CheckSession extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(CheckSession.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("called..");
		HttpSession session = request.getSession();
		Object loginIdObj = session.getAttribute("id");
		String target = "/ch05/session/loginform.jsp";
		if (loginIdObj != null) {
			logger.trace("session에 ID 존재 :" + loginIdObj);
			target = "/ch05/session/main.jsp";
		}
		logger.trace("나는? " + request.getRequestURI() + " 이동 : " + target);
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

}
