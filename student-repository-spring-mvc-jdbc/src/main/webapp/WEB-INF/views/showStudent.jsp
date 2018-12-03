<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Show Student</title>
</head>

<body>

	<Center>

		<form:form name="searchStudentForm" action="/StudentRepository/showStudent" method="POST">
			Enter Id <input type="text" name="id" /> <br /> <br />
			<input type="submit" value="Search Student" name="search" />
		</form:form>

		<br /> <br />
		<h1>Student Details</h1> <br /> <br />
		<h1>${showStatus}</h1> <br /> <br />

		ID : ${id} <br />
		Name : ${name} <br />
		Gender : ${gender} <br />
		Course : ${course} <br />
		Email : ${email} <br />
		Phone : ${phone}

	</Center>

</body>

</html>