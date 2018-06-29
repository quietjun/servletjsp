package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderParseServlet
 */
@WebServlet("/header")
public class HeaderParseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderParseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> enume = request.getHeaderNames();
		response.setContentType("text/html;charset=utf-8");
		response.addIntHeader("refresh", 3);
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Cache-Control", "no-store");
		PrintWriter out = response.getWriter();

		while (enume.hasMoreElements()) {
			String hName = enume.nextElement();
			out.println("header name : " + hName + "<br>");
			out.println("&nbsp;&nbsp;" + request.getHeader(hName) + "<br>");
		}
		// 헤더 정보의 활용

		out.println("현재 시각 : " + new Date());
	}

}
