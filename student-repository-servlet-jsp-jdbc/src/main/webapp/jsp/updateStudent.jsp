<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Update Student</title>
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
	<center>
		<h1>Update Student Data</h1><br /><br />
		<form>
			Id : <input type="text" name="id" value="${id}" /><br />
			<br /> Name <input type="text" name="name" value="${name}" /><br />
			<br /> Gender <input type="text" name="gender" value="${gender}" /><br />
			<br /> Course <input type="text" name="course" value="${course}" /><br />
			<br /> Email <input type="text" name="email" value="${email}" /><br />
			<br /> Phone <input type="text" name="phone" value="${phone}" /><br />
			<br /> Username <input type="text" name="username" value="${username}" /><br />
			<br /> Password <input type="text" name="password" value="${[password]}" /><br />
			<br /> <input type="submit" value="Update Student" name="updatestudent" onclick="form.action='/StudentRepository-1.0/updateStudent';form.method='get';" />
			<a href="student.jsp" class="button">Go to Homepage</a>
		</form>
	</center>
</body>

</html>