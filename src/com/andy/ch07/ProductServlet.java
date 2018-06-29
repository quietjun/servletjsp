package com.andy.ch07;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andy.ch07.service.ProductService;
import com.andy.entity.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet(name = "ProductListServlet", urlPatterns = { "/ProductListServlet" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		ProductService service = ProductService.getInstance();
		request.setAttribute("productList", service.getAllProducts());
		String target = "/ch07/productaddresult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void temp(HttpServletRequest request) {
		java.util.ArrayList<com.andy.entity.Product> products =
				(java.util.ArrayList<com.andy.entity.Product>) request.getAttribute("productList");
		if (products == null) {
			products = new java.util.ArrayList();
			request.setAttribute("products", products);
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		ProductService service = ProductService.getInstance();
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String producer = request.getParameter("producer");
		Product product = new Product(code, name, Integer.parseInt(price),	producer);
		service.addProduct(product);
		
		doGet(request, response);
	}
}
