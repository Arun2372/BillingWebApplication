<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
table{
margin-left: auto;
margin-right: auto;
}
.center{
text-align : center;
}
</style>
</head>
<body>
<br>
<br>
<h1 class = "center">Login</h1>
<form action ="Login" method ="post">
<table>
<tr>
	<td>Username:</td>
	<td><input type="text" name="username" required></td>
<tr>
	<td>password</td>
	<td><input type = "password" name = "password" required></td>
</tr>
<tr>
	<td></td>
	<td><input type = "submit" value="login" required></td>
</tr>
<tr>
<td class = "center"><a href = "ForgotPassword.jsp">ForgotPassword</a></td>
<td class = "center"><a href = "AccountCreation.jsp">AccountCreation</a></td>
</tr>
</table>
</form>
 
</body>
</html>