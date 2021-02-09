<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "javax.persistence.EntityManager" %>
<%@ page import = "it.beije.ananke.rubrica.ContattoMio" %>
<%@ page import = "it.beije.ananke.rubrica.RubricaEntityManager" %>
<%@ page import = "it.beije.ananke.web.Operazioni" %>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Stato Rubrica</title>
</head>
<body>
	<h1> Rubrica </h1>
	<table style="width:100%">
	  		<tr>
	    		<th>NOME</th>
	    		<th>COGNOME</th>
	    		<th>EMAIL</th>
	    		<th>TELEFONO</th>
	  		</tr>
	  		<% EntityManager em = RubricaEntityManager.getEntityManager();
			Operazioni op = new Operazioni();
			List<ContattoMio> lista = op.lettura(em);
			if(lista == null){
				out.println("La tua rubrica è vuota!");
				out.println("<form action = \"./SevletAggiungi\"><input type =\"submit\" value=\"Aggiungi\"> </form>");
			}else{
				for(ContattoMio c: op.lettura(em)){
					out.println("<tr id = " + c.getId() + ">"
							+ "<td>" + c.getName() + "</td>"
							+ "<td>" + c.getSurname() + "</td>"
							+ "<td>" + c.getEmail() + "</td>"
							+ "<td>" + c.getTelephone() + "</td>"
							+ "<td> <form action = \"./ServletModifica\"> <input type=\"submit\" value = \"Modifica\"> </form></td>"
							+ "<td> <form action = \"./ServletElimina\"> <input type=\"submit\" value = \"Elimina\"> </form></td>"
							+"</tr>");
				}
			}
			em.close();
			%>
		</table>
</body>
</html>