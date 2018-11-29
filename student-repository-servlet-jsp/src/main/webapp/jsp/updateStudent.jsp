<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateStudent</title>
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
<h1>Update Student</h1><br /><br />
	<form>
		Id : <input type="text" name="id" value="${id}"/><br />
		<br /> Name  <input type="text" name="name" value="${name}"/><br />
		<br /> Age  <input type="text" name="age" value="${age}"/><br />
		<br /> Course  <input type="text" name="course" value="${course}"/><br />
		<br /> Address  <input type="text" name="address" value="${address}"/><br />
		<br /> Contact  <input type="text" name="contact" value="${contact}"/><br />
		<br /> <input type="submit" value="Update Student" name="updatestudent"
			onclick="form.action='/StudentRepository/UpdateStudentToDb';form.method='get';" />
		<a href="Student.jsp" class="button">Go to homepage</a>
	</form>
	</center>
</body>
</html>