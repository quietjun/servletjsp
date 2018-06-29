package com.andy.ch08.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JDNIDBUtil {
	private DataSource ds = null;
	private static JDNIDBUtil instance = new JDNIDBUtil();

	public static JDNIDBUtil getInstance() {
		return instance;
	}

	private JDNIDBUtil() {
		setupDs();
	}
	
	private void setupDs(){
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/myoracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection con){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}
	public void close(Statement stmt){
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}
	public void close(Statement stmt, ResultSet rset){
		if(rset!=null){
			try {
				rset.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		close(stmt);
	}
}
