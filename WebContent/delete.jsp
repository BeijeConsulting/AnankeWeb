<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.rubrica.JPAmanager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Contact</title>
</head>
<body>
	<%
	JPAmanager jpa = new JPAmanager();
	jpa.eliminaContattoJPA(Integer.parseInt(request.getParameter("id")));
	%>
	<%response.sendRedirect("index.jsp"); %>
</body>
</html>