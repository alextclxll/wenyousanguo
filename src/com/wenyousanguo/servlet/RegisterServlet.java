package com.wenyousanguo.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wenyousanguo.service.UserService;

public class RegisterServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
		 request.setCharacterEncoding("UTF-8");
		 String name=request.getParameter("userRegisterName");
		 String password=request.getParameter("userRegisterPassword");
		 System.out.println(name);
        UserService userService=new UserService();
        try {
            userService.addUser(name, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
