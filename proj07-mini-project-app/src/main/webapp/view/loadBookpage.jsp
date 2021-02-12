<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 style="color: red; text-align: center;">Book Registration</h1>
<h2 style="color: red;">${msg}</h2>

<form:form action="index" modelAttribute="book" method="Post">
	<table>
		<tr>
			<td>Book Name : -</td>
			<td><form:input path="bookname" /></td>
		</tr>
		<tr>
			<td>Author Name :-</td>
			<td><form:input path="book_authour" /></td>
		</tr>
		<tr>
			<td>Book Price :-</td>
			<td><form:input path="bookprice" /></td>
		</tr>
		<tr>
			<td><input type="reset" value="reset"></td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
	<a href="showbook">view-Books</a>
</form:form>