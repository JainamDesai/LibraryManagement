<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"  %>  
<%@ page import="com.dao.*" %>  
<%@ page import="com.model.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="base.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Books</title>
</head>
<body style="background: rgba(123,34,34,14)">
<div class="container">
<div class="jumbotron">
<h1><b>Show All Books</b></h1>
</div>

<table class="table">
  <thead>
    <tr>
      <th scope="col" style="color: white">Book Id</th>
      <th scope="col" style="color: white">Book Name</th>
      <th scope="col" style="color: white">Book Desc</th>
      <th scope="col" style="color: white">Book Price</th>
      <th scope="col" style="color: white">Book Delete</th>
      <th scope="col" style="color: white">Book Update</th>
    </tr>
  </thead>
  <tbody>
<%

UserDBAccess as = new UserDBAccess();
List<UserLibrary> list = as.getAllBooks();
for(UserLibrary k : list){
%>
    <tr>
      <td scope="row" style="color: white"><%= k.getId() %></th>
      <td style="color: white"><%=k.getBook_name() %></td>
      <td style="color: white"><%=k.getBook_desc() %></td>
      <td style="color: white"><%=k.getPrice() %></td>
      <td style="color: white"><a href="DeleteBook?id=<%=k.getId()%>" class="btn btn-primary">Delete Book</a></td>
      <td style="color: white"><a href="UserUpdate?id=<%=k.getId()%>" class="btn btn-primary">Update Book</a></td>
    </tr>
    <%
}
    %>
  </tbody>
</table>
<a href="homes.html" class="btn btn-primary">GO TO DASHBOARD</a>
</div>
</body>
</html>