<%@page import="java.util.List"%>
<%@page import="it.beije.ananke.rubrica.Contatto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="it.beije.ananke.rubrica.JPAmanager"%>

<!DOCTYPE html>
<html>
	<head>
		<title>My Contacts</title>
	</head>
	
	<style>
		li {
			float: left;
		}
		li a {
		  display: block;
		  color: white;
		  text-align: center;
		  padding: 14px 16px;
		  text-decoration: none;
		}
		ul {
		  list-style-type: none;
		  margin: 0;
		  padding: 0;
		  overflow: hidden;
		  background-color: #333;
		}
		li a:hover {
			background-color: #111;
		}	
		.dropdown {
		  position: relative;
		  display: inline-block;
		}
		
		.dropdown-content {
		  display: none;
		  position: absolute;
		  background-color: #f9f9f9;
		  min-width: 160px;
		  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
		  padding: 12px 16px;
		  z-index: 1;
		}
		
		.dropdown:hover .dropdown-content {
		  display: block;
		}
	</style>
	
	<%	
	JPAmanager jpa = new JPAmanager();
	List<Contatto> contatti = new ArrayList<>();
	contatti = jpa.leggiDB();
	%>
	
	<body>
		<nav>
			<ul>
			
				<li><a href="index.jsp">Home</a></li>				
				<li><a href="">Import</a></li>
				<li><a href="">Export</a></li>
				<li style="float:right"><a href="">Register</a></li>
				<li style="float:right"><a href="">Login</a></li>
			</ul>
			
		</nav>
		<div style="margin:16px">
			<a href="add.html" class="button">
				<img src="img/add.png" width="30px" height="30px">
			</a>
		</div>
		<form id="delete" action="">
			</form>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Surname</th>
				<th>Email</th>
				<th>Telephone</th>
			</tr>
			<%
			for(Contatto contatto : contatti){
			%>			
			<tr>				
				<td><%=contatto.getId()%></td>
				<td><%=contatto.getNome()%></td>
				<td><%=contatto.getCognome()%></td>
				<td><%=contatto.getEmail()%></td>
				<td><%=contatto.getTelefono()%></td>
				<td>
				<a href="edit.jsp?id=<%=contatto.getId()%>" class="button">
					<img src="img/edit.png" alt="Edit" width="30px" height="30px">
					</a>
				</td>
				<td>
				<a href="delete.jsp?id=<%=contatto.getId()%>" class="button">
					<img src="img/delete.png" alt="Delete" width="30px" height="30px">
					</a>
				</td>			
			</tr>
			<%
			}
			%>
		</table>
	</body>
</html>