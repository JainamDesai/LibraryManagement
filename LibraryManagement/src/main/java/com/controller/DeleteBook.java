package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDBAccess;
import com.model.UserLibrary;

/**
 * Servlet implementation class DeleteBook
 */
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.valueOf(request.getParameter("id"));
		UserDBAccess as = new UserDBAccess();
		UserLibrary lib = new UserLibrary();
		as.deleteBook(id);
		RequestDispatcher rd = request.getRequestDispatcher("ShowAllBooks.jsp");
		rd.forward(request, response);
		

	}


}
