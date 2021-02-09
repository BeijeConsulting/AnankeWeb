<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimino l'utente dal DB</title>
</head>
<body>
<% String email = request.getParameter("email"); 
JPAmanager j = new JPAmanager();
j.delete(email);
out.print("CONTATTO ELIMINATO");
%>
</body>
</html>