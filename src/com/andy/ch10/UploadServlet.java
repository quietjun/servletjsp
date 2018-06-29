package com.andy.ch10;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class UploadServlet
 */

@WebServlet("/upload")
@MultipartConfig(
		location="c:\\Temp\\upload"
		, maxFileSize=400000l				// 최대 파일 사이즈
		, maxRequestSize=450000l			// 최대 전달 바이트 수
		, fileSizeThreshold=1000			// 파일 업로드 시 임시파일을 만들어야하는 사이즈
		)
public class UploadServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(UploadServlet.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String desc1 = request.getParameter("file1_desc");
		logger.trace("desc1 : {}", desc1);
		handlePart(request.getPart("file1"));
		String desc2 = request.getParameter("file2_desc");
		logger.trace("desc2: {}", desc2);
		handlePart(request.getPart("file2"));
		
		response.getWriter().append("upload done");
	}
	
	private void handlePart(Part part) throws IOException {
		String name = part.getName();
		String fileName = part.getSubmittedFileName();
		long size = part.getSize();
		part.write(fileName);
		logger.trace("part1- name: {}, fileName: {}, size: {}",name, fileName, size);
	}

	
	private void getAllParts(HttpServletRequest request) throws IOException, ServletException{
		String contentType = request.getContentType();
		logger.trace("content type: {}", contentType);
		if(contentType!=null && contentType.startsWith("multipart/form-data")) {
			Collection<Part> parts = request.getParts();
			for(Part part: parts) {
				String type = part.getContentType();
				if(type!=null) {
					String fileName = part.getSubmittedFileName();// servlet 3.1
					part.write(fileName);
				}
				
			}
			logger.trace("Yes");
		}
	}
}
