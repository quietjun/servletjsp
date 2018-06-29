package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadProblemServlet
 */
@WebServlet("/thread")
public class ThreadProblemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name = null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		for(int i=0; i<10; i++) {
			out.print(Thread.currentThread().getName()+ " : "+name+" : "+i+"<br>");
			out.flush();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		out.println("</body></html>");
	}
}
