<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="it.beije.ananke.web.*"%>
        <%@page import="java.util.*"%>
    
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>Rubrica</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div id="head"> <h1>Rubrica</h1></div>
    
    <div id="conteiner"> 
<div class="divlat">

</div>
<div class="divlat" style="width: 90%; background-color: white;">
<center>
    <table class="minimalistBlack">
        <thead>
        <tr>
        <th>Nome</th>
        <th>Cognome</th>
        <th>Email</th>
        <th>Telefono</th>
        <th>Elimina</th>
        <th>Modifica</th>
            </tr>
        </thead>
<%
StringBuilder s= new StringBuilder();
		JPAManager jpa=new JPAManager();
		ArrayList<Contatto> array=null;
		array=jpa.returnList();
		for(Contatto x: array) {
			s.append("  <tr>\r\n"
					+ "        <td>"+x.getNome()+"</td>\r\n"
					+ "        <td>"+x.getCognome()+"</td>\r\n"
					+ "        <td>"+x.getEmail()+"</td>\r\n"
					+ "        <td>"+x.getTel()+"</td>\r\n"
					+ "        <td><a href=\"delete.html?id="+x.getId()+"\">del</a></td>\r\n"
					+ "        <td><a href=\"modifica.jsp?id="+x.getId()+"\">mod</a></td>\r\n"
					+ "        </tr>");
		}
        out.print(s.toString());

%>
    
        
       <tbody>
  </tbody>
        </table>
        </center>
        <br>
        <br>
<a href="insertForm.jsp">Inserisci contatto</a>
<a href="ricercaContatto.jsp">Ricerca contatto</a></div>

<div class="divlat">

</div>


    </div>
</body>
</html>
