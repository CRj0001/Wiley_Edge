package com.wiley.jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class dBConnection {
	static Connection conn;
	public static Connection createConnection() {
		try {
	    	String driver = "com.mysql.cj.jdbc.Driver";
	    	String url = "jdbc:mysql://localhost:3306/wileyjdbc";
	    	String username = "root";
	    	String password = "Arpita@485";
	    	
	    	Class.forName(driver);
	    	
	    	conn = DriverManager.getConnection(url,username,password);
	    }
	     catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		return conn;	
	}
}
