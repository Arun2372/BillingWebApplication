<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="BuyProductDisplay.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<h1>Edit</h1>
<form action="edit" method ="post">
<table>
<input type = "hidden" name = "username" value = <%= session.getAttribute("username") %>>
<tr>
	<td>Product Name :</td>
	<td>
	<select name="name"  required>
  <option value="Apple">Apple</option>
  <option value="Mango">Mango</option>
  <option value="Orange">Orange</option>
  <option value="Banana">Banana</option>
  <option value="Guava">Guava</option>
  <option value="Watermelon">Watermelon</option>
</select></td>
<tr>
	<td>Quantity</td>
	<td><input type = "number" name = "quantity" placeholder = "Quantity" required></td>
</tr>
<tr>
	<td></td>
	<td><input type = "submit" value="Edit" required></td>
</tr>
</table>
</form>

</body>
</html>