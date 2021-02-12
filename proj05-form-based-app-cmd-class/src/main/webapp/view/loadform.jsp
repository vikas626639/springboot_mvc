<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM APPLICATION</title>
</head>

<body>

	<form action="submit" method="post">
		<table>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone Number :</td>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr align="center">
				<td><input type="reset" value="cancle"></td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>