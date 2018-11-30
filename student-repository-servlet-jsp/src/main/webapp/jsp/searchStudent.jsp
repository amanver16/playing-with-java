<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SearchStudent</title>
	<style>
		.button {
	font: bold 11px Arial;
	text-decoration: none;
	background-color: #EEEEEE;
	color: #333333;
	padding: 2px 6px 2px 6px;
	border-top: 1px solid #CCCCCC;
	border-right: 1px solid #333333;
	border-bottom: 1px solid #333333;
	border-left: 1px solid #CCCCCC;
}
</style>
</head>

<body>
	<Center>
		<h1>Search Student</h1>
		<br />
		<br />
		<form>
			Enter ID
			<input type="text" name="id" placeholder="Enter ID" /> <br /> <br />
			<input type="submit" value="View" name="view" onclick="form.action='/StudentRepository-1.0/viewStudent';form.method='get'" />
			<input type="submit" value="Edit" name="edit" onclick="form.action='/StudentRepository-1.0/searchStudent';form.method='get'" />
			<input type="submit" value="Delete" name="delete" onclick="form.action='/StudentRepository-1.0/deleteStudent';form.method='get'" />
			<a href="student.jsp" class="button">Go to Homepage</a>
		</form>
	</Center>
</body>

</html>