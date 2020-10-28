<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="base.jsp"></jsp:include>
<title>Add Book In Library</title>
</head>
<body style="background: rgba(123,34,34,14)">
<div class="container">
<div class="jumbotron mt-4">
<h1><b>Book Registration Form:-</b></h1>
</div>
<form action="LibraryController" method="post">
  <div class="form-group">
    <label for="name" style="color: white">Book Name:-</label>
    <input type="text" class="form-control" id="name" name="book_name"  placeholder="Enter book name..........">
  </div>
   <div class="form-group" style="color: white">
    <label for="desc">Book Description:-</label>
    <input type="text" class="form-control" id="desc" name="book_desc"  placeholder="Enter book description........">
  </div>
     <div class="form-group" style="color: white">
    <label for="price">Book Price:-</label>
    <input type="number" class="form-control" id="price" name="price"  placeholder="Enter book price..........">
  </div>
  <div class="text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>
</div>
</body>
</html>