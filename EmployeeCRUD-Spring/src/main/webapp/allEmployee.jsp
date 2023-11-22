<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h1>Employee Details</h1>
	<table>
		<tr>
			<th>Employee RollNO : </th>
			<th>Employee ID : </th>
			<th>Employee Name : </th>
			<th>Employee Age : </th>
			<th>Employee Job : </th>
			<th>Employee Salary : </th>
			<th>Employee Location : </th>
		</tr>
		<d:forEach var="employee" items="${Employes}">
		<tr>
			<td>${employee.erollno}</td>
			<td>${employee.eid}</td>
			<td>${employee.ename}</td>
			<td>${employee.eage}</td>
			<td>${employee.job}</td>
			<td>${employee.salary}</td>
			<td>${employee.location}</td>
		</tr>
		
		</d:forEach>
		
	</table>

</body>
</html>