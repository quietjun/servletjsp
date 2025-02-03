package com.quietjun.sessioncoolie.controller.a_cookie;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quietjun.sessioncoolie.model.MyService;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/cookie/calc")
@Slf4j
public class CalcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher disp = request.getRequestDispatcher("/cookie/calc.jsp");
        disp.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // parameter 확인
        String param1 = request.getParameter("num1");
        String param2 = request.getParameter("num2");
        log.debug("param1: {}, param2: {}", param1, param2 );
        
        // business logic
        int result = MyService.getService().add(Integer.parseInt(param1), Integer.parseInt(param2));
        StringBuilder newValue = new StringBuilder(param1  ).append("+").append(param2).append("=").append(result);
        Cookie history = new Cookie("calc_"+System.currentTimeMillis(), newValue.toString());
        history.setMaxAge(60*1);
        response.addCookie(history);
        
        response.sendRedirect(request.getContextPath()+"/cookie/calc.jsp");
    }

}
