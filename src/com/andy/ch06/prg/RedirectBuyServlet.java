package com.andy.ch06.prg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/redirectBuyServlet")
public class RedirectBuyServlet extends HttpServlet {
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
		HttpSession session = request.getSession();
		session.setAttribute("product", product);
		response.sendRedirect(request.getContextPath() + "/ConfirmServlet");
	}
	
	

}
