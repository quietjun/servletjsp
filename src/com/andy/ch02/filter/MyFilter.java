package com.andy.ch02.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet Filter implementation class MyFilter
 */
//@WebFilter(dispatcherTypes = { DispatcherType.REQUEST }
//		, servletNames = { "hello" })
public class MyFilter implements Filter {
	private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

	/**
	 * Default constructor.
	 */
	public MyFilter() {
		logger.trace("생성자 호출 됨");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		logger.trace("필터 소멸자 호출 됨");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		logger.trace("request 단계에서 실행할 작업 등록");
		chain.doFilter(request, response);
		logger.trace("response 단계에서 실행할 작업 등록");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		logger.trace("filter 초기화");
	}

}
