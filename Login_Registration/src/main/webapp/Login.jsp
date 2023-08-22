<%@page import="sms.model.Login_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>

</head>
<body  bgcolor="yellow">
<div align="center">
<h1>Login Page</h1>
<form action="<%=request.getContextPath() %>/Login_Ctrl" method="get"> 
<table>
<tr>
  <td>UserID</td>
  <td><input type="text" name="UserID"></td>
</tr>
<tr>
  <td>Password</td>
  <td><input type="Password" name="Password"></td>
</tr>    
</table>
<input type="Submit" value="Login">
</form>
<% String error = (String) request.getAttribute("Error"); %>
<% if (error != null) { %>
    <p style="color: red;"><%= error %></p>
<% } %>
</div>
</body>

</html>