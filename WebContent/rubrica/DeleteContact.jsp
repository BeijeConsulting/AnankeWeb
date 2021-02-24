<%@page import="it.beije.ananke.jpamanager.JPAManager"%>
<%@page import="it.beije.ananke.rubrica.Contact"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			List<Contact> contacts = JPAManager.selectByField("id", id);
			Contact c = contacts.get(0);
			JPAManager.remove(c);
			response.sendRedirect("PrintForm.jsp");
		%>
	</body>
</html>