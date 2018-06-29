package com.andy.ch02.context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextFileRead
 */
@WebServlet("/ContextFileRead")
public class ContextFileRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		String fileName = ctx.getInitParameter("file");
		InputStream input = ctx.getResourceAsStream(fileName);
		
		Properties props = new Properties();
		props.load(input);
		
		System.out.println(props);
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		String line = null;
		while( (line=reader.readLine())!=null){
			System.out.println(line);
		}
	}

}
