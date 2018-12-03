<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Student</title>
</head>

<body>

	<center>

		<h1>Add Student</h1> <br /> <br />

		<form:form name="addstudentform" action="/StudentRepository/addStudent" method="POST">

			Id : <input type="text" name="id" /> <br /> <br />
			Name <input type="text" name="name" /> <br /> <br />
			Gender <input type="text" name="gender" /> <br /> <br />
			Course <input type="text" name="course" /> <br /> <br />
			Email <input type="text" name="email" /> <br /> <br />
			Phone <input type="text" name="phone" /> <br /> <br />
			Username <input type="text" name="username" /> <br /> <br />
			Password <input type="text" name="password" /> <br /> <br />

			<input type="submit" value="Add Student" name="addstudent" />

		</form:form>

		<br /> <br />
		<h1>${status}</h1>

	</center>

</body>

</html>