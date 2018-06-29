package com.andy.ch02.context;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent sce)  { 
    	ServletContext ctx = sce.getServletContext();
        Connection con = (Connection)ctx.getAttribute("connection");
        if(con!=null){
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
    }

    public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("context initialized...............");
        ServletContext ctx = sce.getServletContext();
        Connection con = null;
        ctx.setAttribute("connection", con);
    }
}
