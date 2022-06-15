<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.DataBase.*,java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
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
<h1>Product</h1>
<table border=1 width=50% height=50%>
<tr>
<td>Product Id</td>
<td>Product Name</td>
<td>Product Price Per Kg</td>
</tr>
<%
	ResultSet rs = ProductTable.getData();
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
	}
%>
</table>
</body>

</html>