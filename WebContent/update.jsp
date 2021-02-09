<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricevo i dati del FORM</title>
</head>
<body>

<%
String cognome = request.getParameter("cognome");
String nome = request.getParameter("nome");
String telefono = request.getParameter("telefono");
String email = request.getParameter("email");
out.print("CONTATTO AGGIORNATO");
JPAmanager j = new JPAmanager();
j.update(email,nome,cognome, telefono);
//.. metodo per inserirli nel DB....magari provo con metodi statici
//Contatto contatto = new Contatto();
//....
//DBmanager.insertContatto(contatto)
//DBmanager.insertContatto(cognome, nome, telefono, email)

%>

COGNOME : <%= cognome %><br>
NOME : <%= nome %><br>
TELEFONO : <%= telefono %><br>
EMAIL : <%= email %><br>
</body>
</html>