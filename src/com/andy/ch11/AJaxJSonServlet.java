package com.andy.ch11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class AJaxServlet
 */
@WebServlet("/AJaxJSonServlet")
public class AJaxJSonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();
		List<Map<String, String>> addresses = new ArrayList<>();
		int count = 15;

		for (int i = 0; i < count; i++)
		{
			Map<String, String> address = new HashMap<>();
			address.put("CustomerName", "한글" + i);
			address.put("AccountId", "1999" + i);
			addresses.add(address);
		}
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write(gson.toJson(addresses));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameterMap());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("message") + "라고??");
	}

}
