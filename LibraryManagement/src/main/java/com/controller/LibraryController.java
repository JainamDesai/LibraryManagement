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
 * Servlet implementation class LibraryController
 */
public class LibraryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = 	response.getWriter();
		response.setContentType("text/html");
		long price = Long.valueOf(request.getParameter("price"));
		String book_name = request.getParameter("book_name");
		String book_desc = request.getParameter("book_desc");
		UserDBAccess as = new UserDBAccess();
		UserLibrary lib = new UserLibrary();
		lib.setPrice(price);
		lib.setBook_desc(book_desc);
		lib.setBook_name(book_name);
		as.createBook(lib);
		RequestDispatcher rd = request.getRequestDispatcher("SuccessMsg.jsp");
		rd.forward(request, response);

	}

}
