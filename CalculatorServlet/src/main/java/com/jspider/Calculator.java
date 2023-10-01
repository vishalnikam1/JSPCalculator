package com.jspider;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int x = Integer.parseInt(request.getParameter("n1"));
		int y = Integer.parseInt(request.getParameter("n2"));

		String b=request.getParameter("cal");

		PrintWriter po = response.getWriter();
		
		if("Addition".equals(b))
		{
			int z=x+y;
			po.println("Sum is :"+z);
			po.println("...|...");
		}
		else if("Subs".equalsIgnoreCase(b))
		{
			int z=x-y;
			po.println("Sub is :"+z);
			
		}
		else if("Multi".equalsIgnoreCase(b))
		{
			int z=x*y;
			po.println("Mul is :"+z);
			
		}
		else if("Div".equalsIgnoreCase(b))
		{
			int z=x-y;
			po.println("Division is :"+z);
			
		}
		
	}

}
