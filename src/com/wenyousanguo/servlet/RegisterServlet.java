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
		 String name=request.getParameter("userRegisterAccount");
		 String password=request.getParameter("userRegisterPassword");
		// System.out.println(name);
        UserService userService=new UserService();
        userService.selectUser(name, password);
        try {
   //         userService.addUser(name, password);
    //        request.getRequestDispatcher("gamefore.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
