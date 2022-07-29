package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<center>");
		out.println("<b>Wellcome<b> "+req.getParameter("name")+" "+req.getParameter("password"));
		out.println("</center>");
	out.println("<!DOCTYPE html>");	
	out.println("<html>");
	out.println("<head>");
	out.println("<meta charset='ISO-88itle>Insert 59-1'>");
	out.println("<ttitle here</title>");	
	out.println("</head>");	
	out.println("<body style='background-color:yellow'>");
	out.println("<form action='saveform' method='post'>");
	out.println("<center>");	
	
	
	out.println("<b style='color:blue'>Enter your name:-</b><input type='text' name='name' ><be><br>");	
	out.println("<b style='color:blue'>Enter roll number:-</b><input type='text' name='rollnu' ><be><br>");	
	out.println("<b style='color:blue'>Enter course:-</b><input type='text' name='course' ><be><br>");
	out.println("<b style='color:blue'>Enter persentage:-</b><input type='text' name='persentage' ><be><br>");	
	out.print("<input type='submit'>");
	
	
	




		out.println("</center>");


		out.println("</form>");


		out.println("</body>")	;
		out.println("</html>");
	}

}
