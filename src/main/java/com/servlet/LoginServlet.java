package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name1=req.getParameter("name");
		String pwd=req.getParameter("password");
		
		if(name1.equals("pritam") && pwd.equals("4321")) {
			//PrintWriter out=resp.getWriter();
			//out.print("<h1> Hello</h1>"+name+" <h1>Wellcome my first Servlet...........</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, resp);
			
			
		}else {
			PrintWriter out=resp.getWriter();
			out.print(name1+" "+pwd+"<h1><center>Retry user name || password !!</center></h1>");
			
			
			resp.setContentType("text/html");

			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			
		}
		
		
	}
}
