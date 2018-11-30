<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>StudentRepository</title>
</head>

<body>
	<center>
		<h1>Student Repository</h1><br /><br />
		<form>
			<br /><input type="submit" value="View Student" name="view" onclick="form.action='jsp/searchStudent.jsp'" /><br />
			<br /><input type="submit" value="Update Student" name="update" onclick="form.action='jsp/searchStudent.jsp'" /><br />
			<br /><input type="submit" value="Delete Student" name="delete" onclick="form.action='jsp/searchStudent.jsp'" /><br />
			<br /><input type="submit" value="Logout" name="logout" onclick="form.action='jsp/login.jsp'" /><br />
		</form>
	</center>
</body>

</html>