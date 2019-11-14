package com.jarmous;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MasterServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
	String p = req.getParameter("email");
	String q = req.getParameter("pass");
	
	if(p == "admin"&& q == "12345678")
	{
		res.getWriter().println(" User Identified:" + p);
	}else{
	res.getWriter().println(" Unauthorized user! ");
	}
	}
}
