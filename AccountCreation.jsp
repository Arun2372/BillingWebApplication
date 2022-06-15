<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Creation</title>
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
<h1>AccountCreation</h1>
<form action ="Create" method ="post">
<table>
<tr>
	<td>Username:</td>
	<td><input type="text" name="username" required></td>
<tr>
	<td>password</td>
	<td><input type = "password" name = "password" required></td>
</tr>
<tr>
	<td>Confirm password</td>
	<td><input type = "password" name = "cpassword" required></td>
</tr>
<tr>
	<td><a href = "Login.jsp">Login</a></td>
	<td><input type = "submit" name ="Create" value="Create" required></td>
</tr>
</table>
</form>
 
</body>
</html>