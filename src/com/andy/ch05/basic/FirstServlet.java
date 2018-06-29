package com.andy.ch05.basic;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final Logger logger;
	static {
		logger = LoggerFactory.getLogger(FirstServlet.class);
	}
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("param");
		logger.trace("param - " + param);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		String sdate = new SimpleDateFormat("yyyy-mm-dd").format(date);
	
		request.setAttribute("reqDate", sdate);
		Object obj = request.getAttribute("reqDate");
		HttpSession session = request.getSession();
		
		session.setAttribute("sesDate", sdate);
		// session.setMaxInactiveInterval(10);
		ServletContext application = request.getServletContext();
		
		application.setAttribute("appDate", sdate);
		String path = "/ch05/basic/first.jsp";
		logger.trace("이동 대상 페이지 - " + path);
//		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
//		dispatcher.forward(request, response);
		
		response.sendRedirect(request.getContextPath()+path);
	}

}
