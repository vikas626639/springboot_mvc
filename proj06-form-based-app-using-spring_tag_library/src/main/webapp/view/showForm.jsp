<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<h1 style="color: red; text-align: center;">STUDENT RAGISTRATION
	FORM</h1>
<form:form action="index" modelAttribute="studentobj" method="post">
	<table align="center" border="1" bordercolor="lightblue">
		<tr>
			<td>Student Roll-No :</td>
			<td><form:input path="sno" /></td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td><form:input path="sname" /></td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td><form:textarea path="addrs" /></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><form:radiobutton path="gender" value="M" />Male
			<form:radiobutton path="gender" value="F" />Fe-Male</td>
		</tr>
		<tr>
			<td>Course :</td>
			<td><form:select path="course"> 
					<form:option value="">--Select--</form:option>
					<form:option value="java">java</form:option>
					<form:option value="spring">Spring</form:option>
					<form:option value="springboot">Spring-boot</form:option>
					<form:option value="microservice">Microservice</form:option>
				</form:select></td>
		</tr>
		<tr>
			<td>Mobile-No :</td>
			<td><form:input path="phno" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Preferable Timing :</td>
			<td><form:checkbox path="time" value="morning" />Morning <form:checkbox
					path="time" value="evening" />Evening<br></td>
		</tr>
		<tr align="center">
			<td><input type="reset" value="reset"></td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>

</form:form>
