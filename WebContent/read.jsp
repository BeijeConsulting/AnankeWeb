<%@page import="it.beije.ananke.rubrica.prova.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leggo i dati del DB</title>
</head>
<body>
<%

JPAmanager j = new JPAmanager();
String str = j.read();
out.print(str);
//.. metodo per inserirli nel DB....magari provo con metodi statici
//Contatto contatto = new Contatto();
//....
//DBmanager.insertContatto(contatto)
//DBmanager.insertContatto(cognome, nome, telefono, email)

%>
</body>
</html>