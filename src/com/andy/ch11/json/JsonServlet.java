package com.andy.ch11.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class JsonServlet
 */
@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get" + request.getParameter("id")+", "+request.getParameter("pass"));
		Users users = new Users("hong", "홍길동", "1234");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		// Object --> String
		out.print(gson.toJson(users));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post");
		request.setCharacterEncoding("utf-8");
		String param = request.getParameter("data");
		Gson gson = new Gson();
		if (param != null) {
			System.out.println(param);
			Users users = gson.fromJson(param, Users.class);
			System.out.println(users.getId() + " : " + users.getName());
		} else {
			System.out.println("data 없음");
		}
	}

}
