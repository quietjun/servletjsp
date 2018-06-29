package com.andy.ch02;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet({ "/redirect" })
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calendar c = Calendar.getInstance();
		int sec = c.get(Calendar.SECOND);
		boolean side = sec % 2 == 0;
		System.out.println("나 서블릿이야.");
		if (side) {
			response.sendRedirect("http://www.google.com");
		} else {
			response.sendRedirect("http://www.naver.com");
		}
	}

}
