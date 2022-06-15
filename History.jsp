<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.Service.*,com.DataBase.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History</title>
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
<h1>History</h1>


<table border=1 width=50% height=50%>

<tr>
<th>Date</th>
<th>Product Name </th>
<th>Product Quantity</th>
<th>Total Price</th>
</tr>

<%
String userid =(String)session.getAttribute("username");
String row = History.getHistoryDate(userid);
out.println(row);
session.setAttribute("username", userid);
%>
</table>
</body>
</html>