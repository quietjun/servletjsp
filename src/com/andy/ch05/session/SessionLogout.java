package com.andy.ch05.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class CookieLogout
 */
@WebServlet("/sessionLogout")
public class SessionLogout extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(SessionLogout.class);
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();

		/*
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("/ch06/session/loginform.jsp");
		 * dispatcher.forward(request, response);
		 */
		logger.trace("send redirect 실행");
		response.sendRedirect("/ServletJsp/ch05/session/loginform.jsp");
	}

}
