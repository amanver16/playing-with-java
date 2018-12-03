<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Remove Student</title>
</head>

<body>

	<Center>

		<h1>Remove Student</h1> <br /> <br />

		<form:form name="removeStudentForm" action="/StudentRepository/removeStudent" method="POST">

			Enter Id <input type="text" name="id" /> <br /> <br />
			<input type="submit" value="Remove Student" name="remove" />

		</form:form>

		<br /> <br />
		<h1>${removeStatus}</h1>

	</Center>
	
</body>

</html>