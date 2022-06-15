<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*, com.DataBase.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
table{
margin-left: auto;
margin-right: auto;
}
h1{
text-align : center;
}
</style>
</head>
<body>
<input type = "hidden" name = "username" value = ${param['username']}>
<h1>Added Product</h1>
<table border=1 width=50% height=50%>
<tr>
	<th>Product Name</th>
	<th>Product Quantity</th>
</tr>
<%
String name = request.getParameter("username");
if(name==null)
	name = (String)session.getAttribute("username");
ResultSet rs1 = Customer_Buy_ProductTable.getData(name);
while(rs1.next())
{
	out.println("<tr><td>"+ rs1.getString(1) +"</td><td>"+ rs1.getInt(2)+"kg</td></tr>");
}
%>
</table>
</body>
</html>