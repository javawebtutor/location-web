<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location Form</title>
</head>
<body>
<h1>Create Location Form</h1>
<form action="saveloc" method="post">
			<table style="with: 50%">
				<tr>
					<td>ID:</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Code:</td>
					<td><input type="text" name="code" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
				<td>Type:</td>
				<td><input type="radio" name="type" value="URBAN">Urban</td>
                <td><input type="radio" name="type" value="RURAL">Rural</td>
                <td><input type="radio" name="type" value="METRO">Metro</td>
                </tr>
			</table>
			<input type="submit" value="Save" /></form>
			${msg}
			<a href="displaylocations">View All</a>
</body>
</html>