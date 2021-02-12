<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 align="center" style="color: red;">List of Books</h1>
<table border="1">
	<th>ID</th>
	<th>NAME</th>
	<th>AUTHOR</th>
	<th>PRICE</th>
	<c:forEach items="${book}" var="b">
		<tr>
			<td>${b.id}</td>
			<td>${b.bookname}</td>
			<td>${b.book_authour}</td>
			<td>${b.bookprice}</td>
		</tr>
	</c:forEach>
</table>
<h1><a href="index">add more book</a></h1>
