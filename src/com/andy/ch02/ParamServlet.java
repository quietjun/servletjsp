package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(ParamServlet.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doLogin("get", request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doLogin("post", request, response);
	}
	
	private void doLogin(String method, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pname = request.getParameter("name");
		String ppass = request.getParameter("pass");
		logger.trace("호출 방식 : "+method+", 파라미터 점검 pname : "+pname+", ppass : "+ppass );
		
		//response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>"+pname+"님 !! 반갑습니다.</h1></body></html>");
	
	}		

}
