<%@page import="it.beije.ananke.rubrica.prova.Contatto"%>
<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email = request.getParameter("email");
JPAmanager j = new JPAmanager();
Contatto c =j.searchEmail(email);
out.print("Hai selezionato il seguente contatto: " + c.getId() + " " + c.getEmail() + " " + c.getName() + " " + c.getSurname() + " " +c.getTelephone());
%>
</body>
</html>