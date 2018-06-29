package com.andy.ch04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProblemServlet
 */
@WebServlet("/ProblemServlet")
public class ProblemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProblemServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			String flag = request.getParameter("errortype");
			System.out.println(flag.length());
			if (flag.equals("code")) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
			} else if (flag.equals("type")) {
				throw new ServletException(new ArrayIndexOutOfBoundsException());
			} else if (flag.equals("other")) {
				response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED,
						"web.xml에는 없지만 에러요.");
			}
		} catch (NullPointerException e) {
			System.out.println("에러 처리 : " + e.getClass().getName());
			String forwardPage = "/ch04/error/nullhandler.jsp";
			request.setAttribute(RequestDispatcher.ERROR_EXCEPTION, new Exception());
			request.setAttribute(RequestDispatcher.ERROR_REQUEST_URI,
					request.getRequestURI());
			request.setAttribute(RequestDispatcher.ERROR_STATUS_CODE,
					HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher(forwardPage);

			dispatcher.forward(request, response);
		}
	}

}
