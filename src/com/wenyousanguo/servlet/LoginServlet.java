package com.wenyousanguo.servlet;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response){
        
        try {
            response.sendRedirect("login.jsp");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
