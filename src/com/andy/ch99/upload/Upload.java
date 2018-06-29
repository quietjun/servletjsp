package com.andy.ch99.upload;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/Upload")
@MultipartConfig(location="d:/temp/uploaded")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Collection<Part> parts = request.getParts();
		
		for(Part part:parts){
			String fileName = part.getSubmittedFileName();
			if(fileName!=null){
				part.write(fileName);
			}
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("name")+"님이 업로드한 파일 목록입니다.<br>");
		out.println("<ul>");
		for(Part part:parts){
			String fileName = part.getSubmittedFileName();
			if(fileName!=null){
				out.println("<li>"+fileName+"</li>");
			}
		}
		out.println("</ul>");
	}

}
