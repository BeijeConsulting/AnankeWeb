<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@page import="it.beije.ananke.rubrica.prova.Contatto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leggo i dati del DB</title>
</head>
<body>
<p><h1> Tabella utenti nel DataBase </h1></p>
<table border = 1>
<th>Nome</th><th>Cognome</th><th>Email</th><th>Numero</th>
<%
JPAmanager j = new JPAmanager();
for(Contatto c : j.getListContatti()) {
	String name = c.getName();
	String username = c.getSurname();
	String email = c.getEmail();
	String tel = c.getTelephone();
//out.print(str);
//.. metodo per inserirli nel DB....magari provo con metodi statici
//Contatto contatto = new Contatto();
//....
//DBmanager.insertContatto(contatto)
//DBmanager.insertContatto(cognome, nome, telefono, email)

%>

<tr><td><%= name %></td><td><%= username %></td><td><%= email %></td><td><%= tel %></td> <td> <button> Modifica </button> </td></tr>

<% } %>

</table>
</body>
</html>