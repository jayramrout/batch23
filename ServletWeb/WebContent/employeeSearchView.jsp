<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.ArrayList"%>
<%@page import="jrout.tutorial.servlet.mvc.Employee" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<%
	String allEmp = request.getParameter("allEmp");
	if("on".equalsIgnoreCase(allEmp)) {
		List<Employee> empList = (List<Employee>)request.getAttribute("allEmployee");
	%>
		
<table class="table table-bordered table-striped">
  <tr >
    <th>Employee Number</th>
    <th>FirstName</th>
    <th>LastName</th>
  </tr>
  <% 
  for(Employee emp : empList) {
	%>
	<tr>
    <td><%=emp.getEmpNo() %></td>
    <td><%=emp.getFirstName() %></td>
    <td><%=emp.getLastName() %></td>
  </tr>
	<%	  
  }
  %>
</table>
	<%

	}else {
		Employee emp = (Employee)request.getAttribute("empInfo");
		out.println("Employee Details = EmpId =" + emp.getEmpNo() +" Emp FN "+ emp.getFirstName());	
	}

	%>
</body>
</html>