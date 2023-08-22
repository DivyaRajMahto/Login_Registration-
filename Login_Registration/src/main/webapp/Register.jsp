<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head  >
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Pink">
<div align="center">
<h1>Student Registration form</h1>
 <form action="<%=request.getContextPath() %>/Register" method="post">
 <table border="2">
  <tr>
    <td>UserID</td>
    <td><input type="text" name="UserID"/></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="password" name="Password"/> </td>
  </tr>
  <tr>
     <td>UserName</td>
     <td><input type="text" name="UserName"/></td>
     
  </tr>  
  <tr>
     <td>Age</td>
     <td><input type="text" name="Age"/></td>
  </tr>
  <tr>
     <td>Address</td>
     <td><input type="text" name="Address"/></td>   
  </tr>
  <tr>
     <td>Branch</td>
     <td><input type="text" name="Branch"/></td>   
  </tr>   
 </table>
 
 <align="center"><input type="submit" value="Submit"/>
 </form>
 <br></br>
 If you already have an Account <a href="Login.jsp">Login</a>
 </div>
</body>
</html>