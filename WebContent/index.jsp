<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Menu Rubrica</title>
</head>
<body>
 <h1>Benvenuto nella tua Rubrica <i class="fa fa-address-book" style="font-size:36px"></i></h1>
		  
		  <h3>Seleziona una funzionalit&agrave</h3>
		  
		  <ol>
				<li>
				<form action="aggiungi_contatto.html" target="_blank">
					<p>Aggiungi un contatto <input type="submit" value="Click here"></p>
				</form>
				</li>
				<li>
				<form action="cerca_contatto.html" target="_blank">
					<p>Cerca un contatto <input type="submit" value="Click here"></p>
				</form>
				</li>
				<li>
				<form action="visualizzaRubrica.jsp" target="_blank">
					<p>Visualizza la elenco contatti<input type="submit" value="Click here"></p>
				</form>
				</li>
		  </ol>

</body>
</html>