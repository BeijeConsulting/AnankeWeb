<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.rubrica.Contatto"%>
<%@page import="it.beije.ananke.database.*"%>
<%@page import="java.util.List"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Contatti</title>

	 <style>
    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 100%;
      margin-left: auto;
      margin-right: auto;
    }

    h1 {
      text-align: centered;
    }

    th {
      border: 1px solid #dddddd;
      text-align: centered;
      padding: 8px;
    }

    td {
      border: 1px solid #dddddd;
      text-align: centered;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
    
    div.a {
	text-align: center;
	}
    
    </style>
	
</head>
<body>

	<div class = "a">

    	<h1>TUTTI I CONTATTI</h1>

  <div class = "a">
    <table style="width:60%">
      <tr>
      	<th>Id</th>
        <th>Nome</th>
        <th>Cognome</th>
        <th>Telefono</th>
        <th>Email</th>
        <th colspan="2">Azioni</th>
      </tr>
      
      
      <%
      
      JPAManager managerJPA = new JPAManager();
      
      List<Contatto> contatti = managerJPA.visualizzaContattiDb();
      
      for(int i = 0;i < contatti.size(); i++) {
    	  
    	  Contatto contatto = contatti.get(i);
    	  
    	  out.print( " <tr>\r\n"  );
    	  out.print(  "<td>" + contatti.get(i).getId() +"</td>\r\n");
    	  out.print(  "<td>" + contatti.get(i).getName() +"</td>\r\n");
    	  out.print(  "<td>" + contatti.get(i).getSurname() +"</td>\r\n");
    	  out.print(  "<td>" + contatti.get(i).getTelephone() +"</td>\r\n");
    	  out.print(  "<td>" + contatti.get(i).getEmail() +"</td>\r\n");
    	  out.print(  "<td>" + "Modifica" + "       " + "Elimina" + "</td>\r\n");
    	  out.print("  </tr>\r\n");
    	  
    	  /*
    	  nome = contatto.getName();
    	  cognome = contatto.getSurname();
    	  numero = contatto.getTelephone();
    	  email = contatto.getEmail();
    	  
    
    	  out.print("Nome : " + nome); 
    	  out.print("Cognome : " + cognome); 
    	  out.println("Telefono : " + numero); 
    	  out.println("Email : " + email); 
    	  */
    	  
      }

		%>
		</table>
	</div>
	
	</div>
      
      <br><br>

<a href="index.jsp">Torna alla Home</a>

</body>
</html>
     

