<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.*,java.sql.*,com.DataBase.*,com.Service.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit And Delete Product</title>
<style>
table,a{
margin-left: auto;
margin-right: auto;
}
h1{
text-align : center;
}
</style>
</head>
<body>

<h1>Edit and Delete</h1>
<table border = 2 width = 50% height = 50%>
<tr>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Total Price</th>
</tr>
<%
String userid =request.getParameter("username");
String table = Bill.getTable(userid);
out.println(table);
session.setAttribute("username", userid);
%>
</table> 
<br>
<center><a href = "Edit.jsp">Edit</a>&nbsp;&nbsp;&nbsp;<a href = "Delete.jsp">Delete</a>&nbsp;&nbsp;&nbsp;<a href = "Bill.jsp">Confirm</a></center>
</body>
</html>