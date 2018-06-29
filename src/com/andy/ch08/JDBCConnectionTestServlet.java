package com.andy.ch08;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andy.ch08.util.BasicDBUtil;
import com.andy.ch08.util.ConnectionPoolDBUtil;
import com.andy.ch08.util.JDNIDBUtil;

/**
 * Servlet implementation class ConnectionTestServlet
 */
@WebServlet("/ConnectionTestServlet")
public class JDBCConnectionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		BasicDBUtil util = BasicDBUtil.getInstance();
		Connection con = util.getConnection();
		out.println("jdbc connection 생성 : " + con+"<br>");
		util.close(con);

		ConnectionPoolDBUtil cutil = ConnectionPoolDBUtil.getInstance();
		con = cutil.getConnection();
		out.println("connection poo의 connection 생성: " + con+"<br>");
		cutil.close(con);
		
		JDNIDBUtil jutil = JDNIDBUtil.getInstance();
		con = jutil.getConnection();
		out.println("connection poo의 connection 생성: " + con+"<br>");
		jutil.close(con);
	}
}
