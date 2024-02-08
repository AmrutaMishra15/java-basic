package com.java.basic;

import java.sql.*;

public class JdbcExample {

	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String USER = "guest";
	static final String PASS = "guest123";
	static final String QUERY = "SELECT id, first, last, age FROM Test";

	public static void main(String[] args) {
		// Establishing Connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				// Create Statement
				Statement stmt = conn.createStatement();

				// Execute Query
				ResultSet rs = stmt.executeQuery(QUERY);) {
			
			// Process result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", Age: " + rs.getInt("age"));
				System.out.print(", First: " + rs.getString("first"));
				System.out.println(", Last: " + rs.getString("last"));
			}
			// Closing the connections
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
