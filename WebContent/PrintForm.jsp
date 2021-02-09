<%@page import="it.beije.ananke.rubrica.rubricajpa.jpamanager.JPAManager"%>
<%@page import="it.beije.ananke.rubrica.Contact"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Rubrica</title>
		<style>
			table, th, td{
				border-collapse: collapse;
				border: 1px solid black;
				text-align: left;
			}
		
		</style>
	</head>
	<h1>Rubrica</h1>
	<body>
		<div>
			<%
			List<Contact> contacts = JPAManager.selectAll();
			for(Contact c:contacts) {
				out.print("<a href = \"ViewContact.jsp?id=" + c.getId() + "\"><div>" + c.getFirstName() + " " + 
					c.getLastName()+ "</div></a>");
			}
			%>
		</div>
	</body>
</html>