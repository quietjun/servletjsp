package com.andy.ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyTest {
	 private static String dbURL = "jdbc:derby://localhost:1527/mytestdb";
	    // jdbc Connection
	    private static Connection conn = null;
	    private static Statement stmt = null;

	    public static void main(String[] args)
	    {
	        createConnection();
	        insertUser("jang", "장길산", "jang1234");
	        selectUser();
	        shutdown();
	    }
	    
	    private static void createConnection()
	    {
	        try
	        {
	            //Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	            //Get a connection
	            conn = DriverManager.getConnection(dbURL, "app", "test"); 
	        }
	        catch (Exception except)
	        {
	            except.printStackTrace();
	        }
	    }
	    
	    private static void insertUser(String id, String name, String pass)
	    {
	        try
	        {
	            stmt = conn.createStatement();
	            stmt.execute("insert into tusers(id, name, pass) values ('" +
	                    id + "','" + name + "','" + pass +"')");
	            stmt.close();
	        }
	        catch (SQLException sqlExcept)
	        {
	            sqlExcept.printStackTrace();
	        }
	    }
	    
	    private static void selectUser()
	    {
	        try
	        {
	            stmt = conn.createStatement();
	            ResultSet results = stmt.executeQuery("select * from tusers");
	            
	            while(results.next())
	            {
	                String id = results.getString("ID");
	                String name = results.getString("name");
	                
	                String pass = results.getString("pass");
	                System.out.println(id + ",\t" + name + ", \t" + pass);
	            }
	            results.close();
	            stmt.close();
	        }
	        catch (SQLException sqlExcept)
	        {
	            sqlExcept.printStackTrace();
	        }
	    }
	    
	    private static void shutdown()
	    {
	        try
	        {
	            if (stmt != null)
	            {
	                stmt.close();
	            }
	            if (conn != null)
	            {
	                DriverManager.getConnection(dbURL + ";shutdown=true");
	                conn.close();
	            }           
	        }
	        catch (SQLException sqlExcept)
	        {
	            
	        }

	    }
	}