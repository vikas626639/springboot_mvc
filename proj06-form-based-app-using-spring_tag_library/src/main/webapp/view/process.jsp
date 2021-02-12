<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1 style="color: red; text-align: center;">STUDENT RAGISTRATION
	FORM</h1>
<h1 style="color: green;">${msg}</h1>
<br>
Roll-Number :- ${studentobj.sno}<br>
Name :- ${studentobj.sname}<br>
Address :- ${studentobj.addrs}<br>
Gender :- ${studentobj.gender}<br>
Mobile :- ${studentobj.phno}<br>
Email :- ${studentobj.email}<br>
Course :- ${studentobj.course}<br>
Preferable Time :- ${studentobj.time[0]},${studentobj.time[1]}<br>
<a href="index">home</a>