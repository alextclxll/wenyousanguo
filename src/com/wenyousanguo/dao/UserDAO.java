package com.wenyousanguo.dao;

public interface UserDAO {
	public  void  addUser(String name,String password);
	public void selectUser(String name,String password);
}
