package com.andy.ch05.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class CookeeLogin
 */
@WebServlet("/sessionLogin")
public class SessionLogin extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(SessionLogin.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession();
		boolean result = (id != null && id.equals("admin") && pass != null && pass.equals("1234"));
		String target = "/ch05/session/loginfail.jsp";
		if (result) {
			session.setAttribute("id", id);
			target = "/ch05/session/main.jsp";
		} else {
			request.setAttribute("failMessage", id + "로는 로그인 할 수 없습니다.");
		}
		logger.trace("나는? " + request.getRequestURI() + " 이동 : " + target);
		// encodeURL : cookie가 막혔을 때 JSESSIONID를 붙이고 다니는 용도
		// target = response.encodeURL(target);
		RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

}
