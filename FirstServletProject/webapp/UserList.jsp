
<%@ page import="java.util.List" %>
<%@ page import="com.servlet.project.dto.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> User Informations are</h1>
	<div>
	 <table border="1">
	  <tr>
	  <td>Name</td>
	  <td>Father Name</td>
	  <td>phone</td>
	  <td>Email</td>
	  <td>City</td>
	  <td>State</td>
	  <td>Country</td>
	  <td>Pincode</td>
	 </tr>
	 <% 
	 List<User> userobj=(List<User>)request.getAttribute("details") ;
	 for(User myuser:userobj){
	 %>
	 <tr>
	 <td><%=myuser.getName() %> </td>
	 <td><%=myuser.getFatherName() %> </td>
	 <td><%=myuser.getPhone()  %> </td>
	 <td><%=myuser.getEmail() %> </td>
	 <td><%=myuser.getCity() %> </td>
	 <td><%=myuser.getState() %> </td>
	 <td><%=myuser.getCountry() %></td>
	 <td><%=myuser.getPincode() %> </td>
	 </tr>
	 
	<%
	}
	%> 
	
	 </table>
	
	</div>
	
</body>
</html>