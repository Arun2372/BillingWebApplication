<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.DataBase.*,com.Service.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
<style type="text/css">
table{
margin-left: auto;
margin-right: auto;
}
h1,a,td{
text-align : center;
}
</style>
</head>
<body>
<h1>Bill</h1>
<table border=1 width=50% height=50%>
<tr>
<th>Product Name </th>
<th>Product Quantity</th>
<th>Total Price</th>
</tr>
<%
	
	String userid = (String)session.getAttribute("username");
	String table = Bill.getBillTable(userid);
	out.println(table);
	String query = "truncate customer_buy_product;";
	Statement st = ConnectionDB.getConnection().createStatement();
	st.execute(query);
	st.close();
	session.setAttribute("username", userid);
%>
</table>
<br>
<br>
<center>
<a href = "History.jsp">History</a>
</center>
</body>
</html>