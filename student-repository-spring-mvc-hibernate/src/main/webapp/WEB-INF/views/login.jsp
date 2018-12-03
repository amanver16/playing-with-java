<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

		<h1>Login To Student Repository</h1>
		<br /> <br />

		<form:form name="loginForm" action="/StudentRepository/login" method="POST">
			Username <input type="text" name="username" /> <br /> <br />
			Password <input type="password" name="password" /> <br /> <br />
			<input type="submit" value="Login" />
		</form:form>

		<br /> <br />
		<h1>${loginStatus}</h1>
		<h1>${logoutStatus}</h1>

	</center>

</body>

</html>