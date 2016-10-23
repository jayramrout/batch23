<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.ArrayList"%>
<%@page import="jrout.tutorial.servlet.mvc.Employee" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@page isELIgnored="true" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<table class="table table-bordered table-striped">
  <tr>
    <th>Employee Number</th>
    <th>FirstName</th>
    <th>LastName</th>
  </tr>
	<c:forEach var="empInfo" items="${allEmployee}">
	<tr>
	    <td><c:out value="${empInfo.empNo}"/></td>
    		<td><c:out value="${empInfo.firstName}"/></td>
    		<td><c:out value="${empInfo.lastName}"/></td>
  	</tr>
  	</c:forEach>  
</table>
	
</body>
</html>