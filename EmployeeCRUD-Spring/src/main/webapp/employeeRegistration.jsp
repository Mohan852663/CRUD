<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="register" method="post">
	<h1>Employee Registration</h1><br>
	<table>
		<tr><td>Employee ID :</td>
			<td><input type="text" name="eid"></td>
		<tr>
		<tr>
			<td>Employee Name : </td>
			<td><input type="text" name="ename"></td>
		</tr>
		<tr>
			<td>Employee Age : </td>
			<td><input type="number" name="eage"></td>
		</tr>
		<tr>
			<td>Employee job : </td>
			<td><input type="text" name="job"></td>
		</tr>
		<tr>
			<td>Employee Salary : </td>
			<td><input type="text" name="salary"></td>
		</tr>
		<tr>
			<td>Employee Location : </td>
			<td><input type="text" name="location"></td>
		</tr>
		<tr>
			<td><button type="submit" value="Register">Submit</button></td>
			<td><button type="reset" value="clear">Clear</button></td>
		</tr>
		<tr>
			<td><a href="showAllEmployee">View All Employess</a></td>
		</tr>
	</table>
	
	</form>
</body>
</html>