<%@page import="it.beije.ananke.managerdb.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@ page import="java.util.*, it.beije.ananke.rubrica.Contatto" %>
 
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Tutti i contatti</title>
</head>
<body>

<%List<Contatto> trovati = JPAmanager.visualizzaContatti();%>

<h3>Ecco i contatti della tua rubrica</h3>

<table>
	<tr>
		<th>ID</th>
		<th>Nome</th>
		<th>Descrizione</th>
		<th>Prezzo</th>
	</tr>
	<%for(Contatto cont : trovati){%>
	<tr>
	<td><%=cont.getId()%></td>
	<td><%=cont.getName()%></td>
	<td><%=cont.getSurname()%></td>
	<td><%=cont.getTelephone() %></td>
	<td><%=cont.getEmail() %></td>
	</tr><%} %>
</table>

</body>
</html>