<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
<title> Registration Form</title>
</head>
<body>
 
  <form:form action="saveuser" method="post" modelAttribute="user">  
 
<h1> Register</h1>
<form action="guru_register" method="post">
			<table style="with: 50%">
			
			<tr>
					<td>User Id</td>
					<td><input type="text" name="user_id" /></td>
			
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				
				<tr>
					<td>User Age</td>
					<td><input type="text" name="user_age" /></td>
				
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contactno" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
			</form:form>
</body>
</html>