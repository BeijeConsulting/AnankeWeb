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
<title>Contatti trovati</title>
</head>
<body>

<%List<Contatto> trovati = JPAmanager.cercaContatto(request.getParameter("fields"));%>

<h3>Ecco i contatti trovati in base alla tua ricerca</h3>

<table>
	<tr>
		<th>ID</th>
		<th>Nome</th>
		<th>Cognome</th>
		<th>Telefono</th>
		<th>Email</th>
	</tr>
	<%for(Contatto cont : trovati){%>
	<tr>
	<td><%=cont.getId()%></td>
	<td><%=cont.getName()%></td>
	<td><%=cont.getSurname()%></td>
	<td><%=cont.getTelephone() %></td>
	<td><%=cont.getEmail() %></td>
	<td><a href="modifica_contatto.jsp?id=<%=cont.getId()%>">Modifica</a></td>
	<td><a href="elimina_contatto.jsp?id=<%=cont.getId()%>">Elimina</a></td>
	</tr>
	<%}%>
</table><br>



</body>
</html>