<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ include file="ProductTableDisplay.jsp"%>
    <%@ include file="BuyProductDisplay.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
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
<br>
<br>
<h1>Add Product</h1>

<form action ="AddProduct" method ="post">
<table>
<input type = "hidden" name = "username" value = ${param['username']}>
<tr>
	<td>Product Name :</td>
	<td>
	<select name="Pname"  required>
  <option value="Apple">Apple</option>
  <option value="Mango">Mango</option>
  <option value="Orange">Orange</option>
  <option value="Banana">Banana</option>
  <option value="Guava">Guava</option>
  <option value="Watermelon">Watermelon</option>
</select></td>
<tr>
	<td>Quantity</td>
	<td><input type = "number" name = "Pquantity" placeholder = "Quantity" required></td>
</tr>
<tr>
	<td><input type = "submit" name ="add" value ="Add" required></td>
	<td><input type = "submit" name ="buy" value="Buy" required></td>
</tr>
</table>
</form>
 
</body>
</html>