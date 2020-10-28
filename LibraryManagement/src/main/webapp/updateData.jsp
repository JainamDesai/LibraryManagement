<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*"  %>  
<%@ page import="com.dao.*" %>  
<%@ page import="com.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="base.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Data</title>
</head>
<body`style="background: rgba(123,34,34,14)">
<%
int id = Integer.valueOf(request.getParameter("id"));
String book_name = request.getParameter("book_name");
String book_desc = request.getParameter("book_desc");
long price = Long.valueOf(request.getParameter("price"));
UserDBAccess as = new UserDBAccess();
UserLibrary lib = as.getBook(id);
lib.setBook_name(book_name);
lib.setBook_desc(book_desc);
lib.setPrice(price);
as.updateUser(lib);
RequestDispatcher rd = request.getRequestDispatcher("SuccessMsg.jsp");
rd.forward(request, response);
%>
</body>
</html>