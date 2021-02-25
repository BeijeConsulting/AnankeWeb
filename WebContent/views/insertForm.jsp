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

</div><div class="divlat" style="width: 90%; background-color: white;">
     
    <form action="./inserisci" method="post">
   <fieldset>
        <legend>Compila i campi</legend>
    <label for="name">Nome:   </label> <input type="text" name="name"class="input"required placeholder="Mario"> <br>
    <label for="name">Cognome:   </label> <input type="text" name="surname"class="input" required placeholder="Rossi"> <br>
    <label for="name">Email:   </label> <input type="text" name="email"class="input" placeholder="mariorossi@cipolla.it"> <br>
    <label for="name">Telefono:   </label> <input type="text" name="tel"class="input" required placeholder="334xxxxxx"> <br>
<button class="button"type="submit">Salva Contatto</button>
<%
if(request.getParameter("name")!=null){
	JPAManager c= new JPAManager();
	Contatto cz= new Contatto();
	cz.setNome(request.getParameter("name"));
	cz.setCognome(request.getParameter("surname"));
	cz.setEmail(request.getParameter("email"));
	cz.setTel(request.getParameter("tel"));
	c.addContatto(cz);
	out.print("<p style=\"color:green\">Contatto Aggiunto Correttamente</p>");
}
%>
    </fieldset>
    </form>
   
  <a href="index1.jsp">Torna Indietro</a>
    <a href="ricercaContatto.jsp">Ricerca contatto</a></div>

<div class="divlat">

</div>


    </div>
</body>
</html>
