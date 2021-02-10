<%@page import="it.beije.ananke.rubrica.Contatto"%>
<%@page import="it.beije.ananke.rubrica.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Add Contact</title>
		
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

			input{
			margin: 8px;
			width:80%;
			height:40px;
			padding:8px;
			}	
		</style>
	</head>
	
	<body style="background-color:#f9f9f9">
		<nav>
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="">Import</a></li>
				<li><a href="">Export</a></li>
				<li style="float:right"><a href="">Register</a></li>
				<li style="float:right"><a href="">Login</a></li>
			</ul>
		</nav>
	
	<%
	JPAmanager jpa = new JPAmanager();
	Contatto contatto = new Contatto();
	contatto = jpa.ricercaContattoJPA(Integer.parseInt(request.getParameter("id")));
	%>
		<div style="background-color:#ececec; text-align:center;margin-top:5%; 
			margin-left: auto; margin-right: auto; width: 30%; border: 3px solid #C3CEC4; 
			padding: 10px;">
			<h2>Edit contact</h2>
			<form action="./EditServlet" method="post">
				<input type="text" id="id" name="id" value="<%=contatto.getId()%>" disabled><br>
			  	<input type="text" id="fname" name="fname" value="<%=contatto.getNome()%>" placeholder="First Name"><br>
			 	<input type="text" id="lname" name="lname" value="<%=contatto.getCognome()%>" placeholder="Last Name"><br>
			 	<input type="text" id="email" name="email" value="<%=contatto.getEmail()%>" placeholder="email"><br>
			 	<input type="text" id="tel" name="tel" value="<%=contatto.getTelefono()%>" placeholder="telephone"><br>
				<input type="submit" value="Edit"/>
			</form>
		</div>
	
	</body>
</html>