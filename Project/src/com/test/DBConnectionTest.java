package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class DBConnectionTest {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "hr";
	private static final String PW = "hr";

	//@Test
	public void testConnection() {
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testC() throws ClassNotFoundException {
		Class.forName(DRIVER);
		try {
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
