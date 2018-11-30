<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Data</title>
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
        <h1>Student Data</h1>
        <br />
        <br />
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Course</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
            <tr>
                <td>${id}</td>
                <td>${name}</td>
                <td>${gender}</td>
                <td>${course}</td>
                <td>${email}</td>
                <td>${phone}</td>
            </tr>
        </table>
        <br />
        <br />
        <a href="jsp/student.jsp" class="button">Go to Homepage</a>
    </Center>
</body>

</html>