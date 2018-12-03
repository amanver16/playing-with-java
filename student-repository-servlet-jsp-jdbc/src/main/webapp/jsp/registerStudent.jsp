<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register Student</title>
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
		<h1>Register Student</h1><br /><br />
		<form>
			Id <input type="text" name="id" /> <br /> <br />
			Name <input type="text" name="name" /> <br /> <br />
			Gender <input type="text" name="gender" /> <br /> <br />
			Course <input type="text" name="course" /> <br /> <br />
			Email <input type="text" name="email" /> <br /> <br />
			Phone <input type="text" name="phone" /> <br /> <br />
			Username <input type="text" name="username" /> <br /> <br />
			Password <input type="password" name="password" /> <br /> <br />
			<input type="submit" value="Register" name="register" onclick="form.action='/StudentRepository-1.0/register';form.method='GET';" />
			<a href="login.jsp" class="button">Login</a>
		</form>
	</center>
</body>

</html>