package com.andy.ch06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTemplate
 */
@WebServlet("/tmptest")
public class RequestTemplate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = "ch06/template/template.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		request.setAttribute("content_page", "/ch02/timestable.jsp");
		dispatcher.forward(request, response);
	}
}
