package com.wenyousanguo.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response){
        
        try {
            PrintWriter pw=response.getWriter();
            pw.write("¹þ¹þ¹þ");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
