package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTableServlet
 */
@WebServlet("/gugu")
public class TimesTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dan = 5;
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder("<html><body>");
		builder.append("times table for " + dan);
		builder.append("<table border='1'><tr><th>first num</th><th>second num</th><th>result</th></tr>");
		for (int i = 1; i < 10; i++) {
			builder.append("<tr><td>").append(dan).append("</td><td>");
			builder.append(i).append("</td><td>").append(dan * i);
			builder.append("</td></tr>");
		}
		builder.append("</table></body></html>");
		out.println(builder.toString());
	}

}
