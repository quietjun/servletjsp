package com.andy.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("first");
		String oper = request.getParameter("oper");
		String second = request.getParameter("second");

		int num1 = Integer.parseInt(first);
		int num2 = Integer.parseInt(second);
		int result = 0;
		String msg = null;
		switch (oper) {
		case "/":
			result = num1 / num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "+":
			result = num1 + num2;
			break;
		default:
			msg = "알 수 없는 연산입니다.";
		}
		msg= msg==null?"연산 결과는 "+result:msg;
		
		PrintWriter out = response.getWriter();
		out.println(result);

	}

}
