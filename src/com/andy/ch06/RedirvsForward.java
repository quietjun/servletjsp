package com.andy.ch06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirvsForward
 */
@WebServlet("/redirvsforward")
public class RedirvsForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirvsForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String target = "/ch06/forward/redirvsforward/redirvsforwardresult.jsp";
		if (type.equals("forward")) {
			// 경로명에서 / 의미는 current context root
			RequestDispatcher dispatcher = request.getRequestDispatcher(target);
			dispatcher.forward(request, response);
		} else {
			String name = request.getParameter("name");
			// 경로명에서 / 의미는 container root
			response.sendRedirect("/ServletJsp" + target + "?name=" + name);
		}
	}


}
