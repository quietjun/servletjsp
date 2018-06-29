package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "처음 만드는 서블릿", urlPatterns = { "/HelloServlet" })
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String data = "<html><body><h1>Hello Servlet</h1></body></html>";
		System.out.println("System.out.println - "+data);
        
		System.out.println("request uri: "+request.getRequestURI());
		System.out.println("request url: "+request.getRequestURL());
		System.out.println("context path: "+request.getContextPath());
		System.out.println("servlet path: "+request.getServletPath());
		
		
        PrintWriter out = response.getWriter();
        out.println("PrintWriter - "+data);
	}
}
