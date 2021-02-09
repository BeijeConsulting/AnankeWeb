<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.rubrica.Contatto"%>
<%@page import="it.beije.ananke.database.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Nuovo Contatto</title>
</head>
<body>

<%
String cognome = request.getParameter("cognome");
String nome = request.getParameter("nome");
String numero = request.getParameter("telefono");
String email = request.getParameter("email");

System.out.println("NUOVO CONTATTO:");
System.out.println("cognome = " + cognome);
System.out.println("nome = " + nome);
System.out.println("telefono = " + numero);
System.out.println("email = " + email);

Contatto contatto = new Contatto(nome, cognome, numero, email);

JPAManager managerJPA = new JPAManager();

managerJPA.inserisciContattoDb(nome, cognome, numero, email);

%>

E' STATO INSERITO IL CONTATTO: <br>
NOME = <%= nome %><br>
COGNOME = <%= cognome %><br>
NUMERO = <%= numero %><br>
EMAIL = <%= email %><br>

<br><br>

<a href="index.jsp">Torna alla Home</a>

</body>
</html>