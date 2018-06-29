package com.andy.ch02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/threadSafe")
public class ThreadSafe extends HttpServlet {
	// Not thread safe, static.
	protected static List<Object> list = new ArrayList<>();

	// Not thread safe
	protected Map<String, Object> map1 = new HashMap<>();

	// Thread safe to access object, not thread safe to reassign variable.
	protected Map<String, Object> map2 = new ConcurrentHashMap<>();

	// Thread safe to access object (immutable), not thread safe to reassign
	// variable.
	protected String aString = "a string value";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Not thread safe, unless the singleton is 100% thread safe.
		// SomeClass.getSomeStaticSingleton();

		// Thread safe, locally instantiated, and never escapes method.
		Set<Object> set = new HashSet<>();
		response.getWriter().append(set.toString());
	}

	private static final long serialVersionUID = 1L;
	// A variable that is NOT thread-safe!
	private int counter = 0;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("<HTML><BODY>");
		resp.getWriter().println(this + ": <br>");
		for (int c = 0; c < 10; c++) {
			synchronized (map1) {
				resp.getWriter().println("Counter = " + counter + "<BR>");
				try {
					Thread.sleep((long) (Math.random() * 1000));

					System.out.println(counter++);

				} catch (InterruptedException exc) {
				}
			}
		}
		resp.getWriter().println("</BODY></HTML>");
	}

}
