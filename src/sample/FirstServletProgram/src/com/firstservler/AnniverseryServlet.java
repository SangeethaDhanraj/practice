package com.firstservler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AnniverseryServlet extends HttpServlet {
	String year;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			year = request.getParameter("Anniversery_year");
			Anniversery an = new Anniversery(year);
			ArrayList<String> value = an.findValue();
			request.setAttribute("model", value);
			RequestDispatcher rd = request.getRequestDispatcher("Anniversery.jsp");
			rd.forward(request, response);
		} finally {
			out.close();
		}
	}

	
}
