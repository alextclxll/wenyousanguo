package com.wenyousanguo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import com.wenyousanguo.dao.UserDAO;

public class UserService implements UserDAO{

	@Override
	public void  addUser(String name, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wenyousanguo?characterEncoding=UTF-8","root","admin");
			String sql="insert into user values(null,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, "2020-02-02");
			ps.execute();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
