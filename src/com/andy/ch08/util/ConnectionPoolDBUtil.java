package com.andy.ch08.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionPoolDBUtil {
	private static final Logger logger;
	static {
		logger = LoggerFactory.getLogger(ConnectionPoolDBUtil.class);
	}
	private DataSource ds = null;
	
	private static ConnectionPoolDBUtil instance = new ConnectionPoolDBUtil();

	public static ConnectionPoolDBUtil getInstance() {
		return instance;
	}

	private ConnectionPoolDBUtil() {
		ds = setupDataSource();
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con= ds.getConnection();
			BasicDataSource bds = (BasicDataSource)ds;
			logger.trace("active connection : {}, idle connection : {}", bds.getNumActive(), bds.getNumIdle());
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		}
		
		return con;
	}
	private BasicDataSource setupDataSource(){
	     BasicDataSource bds = new BasicDataSource();
	     bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	     bds.setUrl("jdbc:oracle:thin:@127.0.0.1:1521/XE");
	     bds.setUsername("scott");
	     bds.setPassword("tiger");
	     bds.setMaxTotal(20);
	     bds.setMaxIdle(10);
	     bds.setInitialSize(5);
	     return bds;
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
