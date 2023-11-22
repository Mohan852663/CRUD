<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
</head>
<body>
	<h1>Display ALl the Students</h1>
	<table>
		<tr><th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student Address</th>
			<th>Course</th>
		</tr>
		<c:forEach var="student" items="${Students}">
		<tr>
			<td>${student.sid}</td>
			<td>${student.sname}</td>
			<td>${student.sage}</td>
			<td>${student.saddress}</td>
			<td>${student.scourse}</td>
		</tr>
		</c:forEach>
			
	</table>
</body>
</html>