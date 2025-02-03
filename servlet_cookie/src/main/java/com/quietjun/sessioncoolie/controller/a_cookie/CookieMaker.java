package com.quietjun.sessioncoolie.controller.a_cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class CookieMaker
 */
@WebServlet("/cookie/cookiemaker")
@Slf4j
public class CookieMaker extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie cookie = new Cookie("user", "andy");
        cookie.setMaxAge(60 * 1);
        response.addCookie(cookie);

        // session 처럼 존재하는 쿠키
        Cookie cookie2 = new Cookie("address", URLEncoder.encode("대한민국 서울특별시", "utf-8"));
        cookie2.setMaxAge(-1);
        response.addCookie(cookie2);

        // 바로 삭제되는 쿠키 
        Cookie cookie3 = new Cookie("phone", "010-0000-0000");
        cookie3.setMaxAge(0);
        response.addCookie(cookie3);

        String type = request.getParameter("type");
        log.debug("path: {}, type: {}", request.getServletPath(), type);
        
        String path = "/cookie/cookieconsumer.jsp";
        if (type.equals("forward")) {
            RequestDispatcher disp = request.getRequestDispatcher(path);
            disp.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + path);
        }
    }
}
