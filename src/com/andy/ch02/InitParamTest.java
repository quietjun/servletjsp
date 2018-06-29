package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamTest
 */
@WebServlet(
		urlPatterns = { "/InitParamTest" }, 
		initParams = { 
				@WebInitParam(name = "greetingText", value = "안녕하세요")
		})
public class InitParamTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String greetingText;
	
	public void init(){
		greetingText = getInitParameter("greetingText");
		System.out.println("greetingText : "+greetingText);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><b>"+greetingText+"</b></body></html>");
	}
}
