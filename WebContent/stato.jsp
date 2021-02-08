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
			RubricaJPA r = new RubricaJPA();
			List<ContattoMio> lista = r.lettura(em);
			if(lista == null){
				
			}else{
				for(ContattoMio c: r.lettura(em)){
					out.println("<tr id = " + c.getId() + "><td>" + c.getName() + "</td>"
							+ "<td>" + c.getSurname() + "</td>"
							+ "<td>" + c.getEmail() + "</td>"
							+ "<td>" + c.getTelephone() + "</td></tr>");
				}
			}
			em.close();
			%>
		</table>
	<h6><a href="indexMio.jsp">VAI AL MENU'</a></h6>
</body>
</html>