package com.andy.ch08.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicDBUtil {
	private static BasicDBUtil instance = new BasicDBUtil();

	public static BasicDBUtil getInstance() {
		return instance;
	}

	private BasicDBUtil() {
	}

	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (SQLException | ClassNotFoundException e) {
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
