<%@page import="org.hibernate.internal.build.AllowSysOut"%>
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
     <%
     boolean corretto=false;
     if(request.getParameter("name")!=null){
    		JPAManager jpa= new JPAManager();
    		String id= request.getParameter("id");
    		int idd=Integer.parseInt(id.trim());
    		jpa.modificaid(idd, request.getParameter("name"), request.getParameter("surname"), request.getParameter("email"), request.getParameter("tel"));
corretto=true;    	 
     }
     %>
    <form action="./modifica.jsp" method="post">
   <fieldset>
        <legend>Compila i campi per la modifica</legend>
        <% 
        		JPAManager jpa= new JPAManager();
	Contatto x=	jpa.returnContatto(Integer.parseInt(request.getParameter("id")));
    System.out.println(x.getId());
        %>
        <input type="text" name="id" style="display: none;" <%="value=\""+x.getId()+"\"" %>>
    <label for="name">Nome:   </label> <input type="text" name="name"class="input"required <%="value=\""+x.getNome()+"\"" %>>  <br>
    <label for="name">Cognome:   </label> <input type="text" name="surname"class="input" required  <%="value=\""+x.getCognome()+"\"" %>> <br>
    <label for="name">Email:   </label> <input type="text" name="email"class="input" required  <%="value=\""+x.getEmail()+"\"" %>> <br>
    <label for="name">Telefono:   </label> <input type="text" name="tel"class="input" required  <%="value=\""+x.getTel()+"\"" %>>  <br>
<button class="button"type="submit">Salva Contatto</button>
    </fieldset>
    </form>
   
  <a href="index1.jsp">Torna Indietro</a>
    <a href="ricercaContatto.jsp">Ricerca contatto</a>
    <% if(corretto)
	out.print("<p style=\"color:green\">Contatto modificato correttamente</p>");
	%>
    </div>

<div class="divlat">

</div>


    </div>
</body>
</html>
