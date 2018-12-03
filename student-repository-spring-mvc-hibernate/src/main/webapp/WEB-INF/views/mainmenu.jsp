<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Main Menu</title>
</head>

<body>

	<center>

		<h1>Student Repository</h1> <br /> <br />

		<form:form action="/StudentRepository/menu" method="POST">

			<input type="submit" value="Add Student" name="add" /> <br /> <br />
			<input type="submit" value="Show Student" name="show" /> <br /> <br />
			<input type="submit" value="Edit Student" name="edit" /> <br /> <br />
			<input type="submit" value="Remove Student" name="remove" /> <br /> <br />
			<input type="submit" value="Logout" name="logout" />
			
		</form:form>

	</center>

</body>

</html>