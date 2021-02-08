<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "javax.persistence.EntityManager" %>
<%@ page import = "it.beije.ananke.rubrica.ContattoMio" %>
<%@ page import = "it.beije.ananke.rubrica.RubricaEntityManager" %>
<%@ page import = "it.beije.ananke.rubrica.RubricaJPA" %>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Rubrica</title>
	</head>
	<body>	
		<h1 style="font-size:20px; text-align: center;">Benvenuto nella tua rubrica!<br>
			 Cosa vuoi fare?
		</h1>
		<ul>
			<li> <a href = "stato.jsp">Visualizza lo stato della tua rubrica</a> </li>
			<li> <a href = "">Aggiungi una nuova voce</a> </li>
			<li> <a href = "">Modifica una voce</a> </li>
			<li> <a href = "">Cancella una voce</a></li>
			<li> <a href = "">Cerca contatti</a></li>
			<li> <a href = "">Esci</a></li>
		</ul>
	</body>	
</html>