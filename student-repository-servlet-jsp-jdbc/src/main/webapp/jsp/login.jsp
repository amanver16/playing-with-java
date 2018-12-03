<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
</head>

<body>

	<center>

		<h1>Login To Student Repository</h1><br /><br />

		<form action="/StudentRepository-1.0/login" method="GET">
			Username <input type="text" name="username" placeholder="Enter Username" /> <br /> <br />
			Password <input type="password" name="password" placeholder="Enter Password" /> <br /> <br />
			<input type="submit" value="Login" />
		</form>

	</center>

</body>

</html>