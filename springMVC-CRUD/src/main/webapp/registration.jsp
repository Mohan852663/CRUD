<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>

<body>
	<h1 style="text-align: center;">Student Management System</h1>
	<form  style="text-align: center; padding: 30px" action="register" method="post">
		Name : <input type="text" name="sname" placeholder="Enter your Name"><br>
		Age  : <input type="number" name="sage" placeholder="Enter your Age"><br>
		Address : <textarea name="saddress" rows="5" cols="30" placeholder="address..."></textarea><br>
		Course : <select name="scourse">
			<option value="B.com">B.com</option>
			<option value="BBA">BBA</option>
			<option value="B.SC">B.SC</option>
			<option value="B.E">B.E</option>
		</select><br>
		<input type="submit" value="Register"><br>
		<input type="reset" value="clear"><br>
	</form>
	<a style="text-align: center;" href="viewAllStudents">View All Students </a>
</body>
</html>