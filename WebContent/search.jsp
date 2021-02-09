<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@page import="it.beije.ananke.rubrica.prova.Contatto"%>
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
Contatto c = j.searchEmail(email);
%>
<p><h2>Utente trovato:</h2></p>
<table>

<tr>
<th align = "left">Nome</th>
<td><% out.println(c.getName()); %></td>
</tr>
<tr>
<th align = "left">Cognome</th>
<td><% out.println(c.getSurname()); %></td>
</tr>
<tr>
<th align = "left">email</th>
<td><% out.println(c.getEmail()); %></td>
</tr>
<tr>
<th align = "left">telefono</th>
<td><% out.println(c.getTelephone());%><td>
</tr>

</table>
</body>
</html>