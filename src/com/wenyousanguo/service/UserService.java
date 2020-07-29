package com.wenyousanguo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wenyousanguo.dao.UserDAO;

public class UserService implements UserDAO{
	Connection con;
	public  UserService(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wenyousanguo?characterEncoding=UTF-8","root","admin");
	} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
}
	@Override
	public void  addUser(String name, String password) {
		
			String sql="insert into user values(null,?,?,?)";
			PreparedStatement ps;
			try {
				ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String date=sdf.format(new Date());
			//System.out.println(s);
			ps.setString(3, date);
			ps.execute();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	
	}
	@Override
	public void selectUser(String account, String password) {
	String sql="select account from user where account=? ";
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, account);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
		//	System.out.println(rs.getString("account"));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
	}

}
