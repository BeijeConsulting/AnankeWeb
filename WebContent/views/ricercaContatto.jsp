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
     
    <form action="./ricercaContatto.jsp" method="post">
   <fieldset>
        <legend>Compila i campi</legend>
    <label for="name">Nome:   </label> <input type="text" name="name"class="input" placeholder="Mario"> <br>
    <label for="name">Cognome:   </label> <input type="text" name="surname"class="input"  placeholder="Rossi"> <br>
    <label for="name">Email:   </label> <input type="text" name="email"class="input" placeholder="mariorossi@cipolla.it"> <br>
    <label for="name">Telefono:   </label> <input type="text" name="tel"class="input"  placeholder="334xxxxxx"> <br>
<button class="button"type="submit">Ricerca</button>

    </fieldset>
    </form>
    <%
  
    if(request.getParameter("name")!=null && request.getParameter("surname")!=null && request.getParameter("email")!=null && request.getParameter("tel")!=null&&( request.getParameter("name").trim().length()>0|| request.getParameter("surname").trim().length()>0|| request.getParameter("email").trim().length()>0||request.getParameter("tel").trim().length()>0)){
    	StringBuilder s= new StringBuilder();
    	s.append(""
    			+ "   <center> <table class=\\\"minimalistBlack\\\">\r\n"
    			+ "		     <thead>\r\n"
    			+ "		     <tr>\r\n"
    			+ "			     <th>Nome</th>\r\n"
    			+ "			    <th>Cognome</th>\r\n"
    			+ "			     <th>Email</th>\r\n"
    			+ "			    <th>Telefono</th>\r\n"
    			+ "			    <th>Elimina</th>\r\n"
    			+ "				       <th>Modifica</th>\r\n"
    			+ "			     </tr>\r\n"
    			+ "			       </thead>\r\n"
    			+ "			      <tbody>\r\n");
    	
    	JPAManager jpa=new JPAManager();
    	ArrayList<Contatto> array=null;
    	array=jpa.ricercaContatti(request.getParameter("name"), request.getParameter("surname"), request.getParameter("email"), request.getParameter("tel"));
    	for(Contatto x: array) {
    		s.append(" <tr>\r\n"
    				+ "        <td>"+x.getNome()+"</td>\r\n"
    				+ "        <td>"+x.getCognome()+"</td>\r\n"
    				+ "        <td>"+x.getEmail()+"</td>\r\n"
    				+ "        <td>"+x.getTel()+"</td>\r\n"
    				+ "        <td><a href=\"delete.html?id="+x.getId()+"\">del</a></td>\r\n"
    				+ "        <td><a href=\"modifica.html?id="+x.getId()+"\">mod</a></td>\r\n"
    				+ "        </tr>");
    	}
    	s.append(""
    			+ "  </tbody> </table></center>  <a href=\"index1.jsp\">Torna Indietro</a>\r\n");
    	out.print(s.toString());
    
    }
    
    %>
    </tbody> </table> <a href="index1.jsp">Torna Indietro</a>
</div>

    		
<div class="divlat">

</div>


    </div>
</body>
</html>
