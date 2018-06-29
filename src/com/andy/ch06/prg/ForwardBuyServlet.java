package com.andy.ch06.prg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/forwardBuyServlet")
public class ForwardBuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String product = request.getParameter("product");
		// 데이터베이스 상품 구매 처리
		System.out.println("상품 구매 처리 합니다.");
		
		request.setAttribute("product", product);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ch06/prg/buyok.jsp");
		dispatcher.forward(request, response);
	}
	
	

}
