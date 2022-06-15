<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
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
<h1>ForgotPassword</h1>
<form action ="ForgotPassword" method ="post">
<table>
<tr>
	<td>Username:</td>
	<td><input type="text" name="username" required></td>
<tr>
	<td>New password</td>
	<td><input type = "password" name = "password" required></td>
</tr>
<tr>
	<td>Confirm password</td>
	<td><input type = "password" name = "cpassword" required></td>
</tr>
<tr>
	<td><a href="Login.jsp">Login</a></td>
	<td><input type = "submit" value="ForgotPassword" required></td>
</tr>
</table>
</form>
 
</body>
</html>