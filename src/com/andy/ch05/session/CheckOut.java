package com.andy.ch05.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/checkOut")
public class CheckOut extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger;
	static {
		logger = LoggerFactory.getLogger(CheckOut.class);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.trace("구매 처리 완료");
		request.getSession().setAttribute("cart", null);
		String path = response.encodeURL("/ch05/session/checkOutResult.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
