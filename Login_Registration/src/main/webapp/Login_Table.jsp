<%@page import="sms.model.Login_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><align="center">
<h1>Student's Information</h1>
<% Login_Model user=(Login_Model)request.getAttribute("Std_Info");
//out.print(user);%>
<table border="1">
   <tr>
   <th> UserID </th>
   <th>UserName</th>
   <th>Age</th>
   <th>Address</th>
   <th>Branch</th>
   </tr>
   
	   <tr>
	   <td><%= user.getUserID() %></td>
	   <td><%= user.getUserName() %></td>
	   <td><%= user.getAge() %></td>
	   <td><%= user.getAddress() %></td>
	   <td><%= user.getBranch() %></td>
       </tr>
	
   </table>
</div>
</body>
</html>