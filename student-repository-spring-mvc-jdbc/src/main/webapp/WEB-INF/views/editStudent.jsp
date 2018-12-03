<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Edit Student</title>
</head>

<body>

	<Center>

		<h1>Search Student</h1> <br /> <br />

		<form:form name="searchStudentForm" action="/StudentRepository/searchForEdit" method="POST">
			Enter Id <input type="text" name="id" /> <br /> <br />
			<input type="submit" value="Search Student" name="search" />
		</form:form>

		<br /> <br />
		<h1>Edit Student Details</h1> <br /> <br />
		<h1>${searchStatus}</h1> <br /> <br />

		<form:form name="editstudentform" action="/StudentRepository/editStudent" method="POST">

			Id : <input type="text" value="${id}" name="id" /> <br /> <br />
			Name <input type="text" value="${name}" name="name" /> <br /> <br />
			Gender <input type="text" value="${gender}" name="gender" /> <br /> <br />
			Course <input type="text" value="${course}" name="course" /> <br /> <br />
			Email <input type="text" value="${email}" name="email" /> <br /> <br />
			Phone <input type="text" value="${phone}" name="phone" /> <br /> <br />
			Username <input type="text" value="${username}" name="username" /> <br /> <br />
			Password <input type="text" value="${password}" name="password" /> <br /> <br />

			<input type="submit" value="Edit Student" name="editstudent" />

		</form:form>

		<br /> <br />
		<h1>${statusAfterEdit}</h1>

	</Center>

</body>

</html>