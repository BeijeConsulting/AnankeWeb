<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="i.beije.ananke.web.ecommerce.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalogo</title>
</head>
<body>
<%

List<Prodotto> list = DbManager.getProdotti();
String htmlCode = "";
int userId = 0;
session.setAttribute("UserId", userId);
if(list == null){
	htmlCode += "NESSUN PRODOTTO NEL CATALOGO";
}else{
	htmlCode += "<h2>CATALOGO<h2><br>";
	htmlCode += "<form action=\"./ServletAggiungiCarrello\" method=\"post\">";
	
	for(Prodotto p : list){

		htmlCode += "| ID Prodotto: " + p.getId() + "|" + " - " + p.getNome() + "&nbsp;&nbsp;Prezzo:" + p.getPrezzo() + "$ " + "|" + "   ";
	
		htmlCode += "QTA:&nbsp;<input type=\"text\" name=\"email\" value=\"0\"><br>";
	
	}

	htmlCode += "<br><input type=\"submit\" value=\"AGGIUNGI AL CARRELLO\"/></form><br>";
	htmlCode += "<form action=\"./ServletVisualizzaCarrello\" method=\"post\">";
	htmlCode += "<br><input type=\"submit\" value=\"VISUALIZZA CARRELLO\"/></form><br>";

}


%>

<%=htmlCode %>


</body>
</html>