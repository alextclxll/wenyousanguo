package com.wenyousanguo.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import java.sql.Connection;

public class Test {
	public static void main(String[] args) {
	try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wenyousanguo?characterEncoding=UTF-8","root","admin");
			String sql="insert into user values(null,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
}
