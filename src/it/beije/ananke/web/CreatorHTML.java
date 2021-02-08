package it.beije.ananke.web;

import java.util.ArrayList;

public class CreatorHTML {
public String createpageAggiunto() {
	StringBuilder s= new StringBuilder();
	s.append(
			" <html lang=\"it\">\r\n"
			+ "<head>\r\n"
			+ "    <meta charset=\"UTF-8\">\r\n"
			+ "    <title>Rubrica</title>\r\n"
			+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
			+ "    \r\n"
			+ "    <div id=\"conteiner\"> \r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
			+ "     \r\n"
			+ "    <form action=\"./servlet\" method=\"post\">\r\n"
			+ "   <fieldset>\r\n"
			+ "        <legend>Compila i campi</legend>\r\n"
			+ "    <label for=\"name\">Nome:   </label> <input type=\"text\" name=\"name\"class=\"input\"required placeholder=\"Mario\"> <br>\r\n"
			+ "    <label for=\"name\">Cognome:   </label> <input type=\"text\" name=\"surname\"class=\"input\" required placeholder=\"Rossi\"> <br>\r\n"
			+ "    <label for=\"name\">Email:   </label> <input type=\"text\" name=\"email\"class=\"input\" placeholder=\"mariorossi@cipolla.it\"> <br>\r\n"
			+ "    <label for=\"name\">Telefono:   </label> <input type=\"text\" name=\"tel\"class=\"input\" required placeholder=\"334xxxxxx\"> <br>\r\n"
			+ "<button class=\"button\"type=\"submit\">Salva Contatto</button>\r\n"
			+ "<p style=\"color:green\">Contatto Aggiunto Correttamente</p>\r\n"
			+ "    </fieldset>\r\n"
			+ "    </form>\r\n"
			+ "   \r\n"
			+ "  <a href=\"index.html\">Torna Indietro</a>\r\n"
			+ "    <a href=\"ricercaContatto.html\">Ricerca contatto</a>"
			+ "</div>\r\n"
			+ "\r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "    </div>\r\n"
			+ "</body>\r\n"
			+ "</html>"
			
			);
	return s.toString();
	
}
	


public String ricercaForm() {
	StringBuilder s= new StringBuilder();
	s.append("<html lang=\"it\">\r\n"
			+ "<head>\r\n"
			+ "    <meta charset=\"UTF-8\">\r\n"
			+ "    <title>Rubrica</title>\r\n"
			+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
			+ "    \r\n"
			+ "    <div id=\"conteiner\"> \r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
			+ "     \r\n"
			+ "    <form action=\"./ricercaContatto.html\" method=\"post\">\r\n"
			+ "   <fieldset>\r\n"
			+ "        <legend>Compila i campi</legend>\r\n"
			+ "    <label for=\"name\">Nome:   </label> <input type=\"text\" name=\"name\"class=\"input\" placeholder=\"Mario\"> <br>\r\n"
			+ "    <label for=\"name\">Cognome:   </label> <input type=\"text\" name=\"surname\"class=\"input\"  placeholder=\"Rossi\"> <br>\r\n"
			+ "    <label for=\"name\">Email:   </label> <input type=\"text\" name=\"email\"class=\"input\" placeholder=\"mariorossi@cipolla.it\"> <br>\r\n"
			+ "    <label for=\"name\">Telefono:   </label> <input type=\"text\" name=\"tel\"class=\"input\"  placeholder=\"334xxxxxx\"> <br>\r\n"
			+ "<button class=\"button\"type=\"submit\">Ricerca</button>\r\n"
			+ "\r\n"
			+ "    </fieldset>\r\n"
			+ "    </form>\r\n"
			+ "    <a href=\"index.html\">Torna Indietro</a>\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "    </div>\r\n"
			+ "</body>\r\n"
			+ "</html>");

	return s.toString();
}




public String ricercaFormResult(String nome, String cognome, String email, String telefono) {
	StringBuilder s= new StringBuilder();
	s.append("<html lang=\"it\">\r\n"
			+ "<head>\r\n"
			+ "    <meta charset=\"UTF-8\">\r\n"
			+ "    <title>Rubrica</title>\r\n"
			+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
			+ "    \r\n"
			+ "    <div id=\"conteiner\"> \r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
			+ "     \r\n"
			+ "    <form action=\"./ricercaContatto.html\" method=\"post\">\r\n"
			+ "   <fieldset>\r\n"
			+ "        <legend>Compila i campi</legend>\r\n"
			+ "    <label for=\"name\">Nome:   </label> <input type=\"text\" name=\"name\"class=\"input\" placeholder=\"Mario\"> <br>\r\n"
			+ "    <label for=\"name\">Cognome:   </label> <input type=\"text\" name=\"surname\"class=\"input\"  placeholder=\"Rossi\"> <br>\r\n"
			+ "    <label for=\"name\">Email:   </label> <input type=\"text\" name=\"email\"class=\"input\" placeholder=\"mariorossi@cipolla.it\"> <br>\r\n"
			+ "    <label for=\"name\">Telefono:   </label> <input type=\"text\" name=\"tel\"class=\"input\"  placeholder=\"334xxxxxx\"> <br>\r\n"
			+ "<button class=\"button\"type=\"submit\">Ricerca</button>\r\n"
			+ "\r\n"
			+ "    </fieldset>\r\n"
			+ "    </form>\r\n"
			+ "+ \"    <table class=\\\"minimalistBlack\\\">\\r\\n\"\r\n"
			+ "				+ \"        <thead>\\r\\n\"\r\n"
			+ "				+ \"        <tr>\\r\\n\"\r\n"
			+ "				+ \"        <th>Nome</th>\\r\\n\"\r\n"
			+ "				+ \"        <th>Cognome</th>\\r\\n\"\r\n"
			+ "				+ \"        <th>Email</th>\\r\\n\"\r\n"
			+ "				+ \"        <th>Telefono</th>\\r\\n\"\r\n"
			+ "				+ \"        <th>Elimina</th>\\r\\n\"\r\n"
			+ "				+ \"        <th>Modifica</th>\\r\\n\"\r\n"
			+ "				+ \"\\r\\n\"\r\n"
			+ "				+ \"        </tr>\\r\\n\"\r\n"
			+ "				+ \"        </thead>\\r\\n\"\r\n"
			+ "				+ \"       <tbody>\\r\\n\");");
		
	JPAManager jpa=new JPAManager();
	ArrayList<Contatto> array=null;
	array=jpa.ricercaContatti(nome, cognome, email, telefono);
	for(Contatto x: array) {
		s.append("  <tr>\r\n"
				+ "        <td>"+x.getNome()+"</td>\r\n"
				+ "        <td>"+x.getCognome()+"</td>\r\n"
				+ "        <td>"+x.getEmail()+"</td>\r\n"
				+ "        <td>"+x.getTel()+"</td>\r\n"
				+ "        <td><a href=\"delete.html?id="+x.getId()+"\">del</a></td>\r\n"
				+ "        <td><a href=\"modifica.html?id="+x.getId()+"\">mod</a></td>\r\n"
				+ "        </tr>");
	}
	
	
	s.append(""
			+ "    <a href=\"index.html\">Torna Indietro</a>\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "<div class=\"divlat\">\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "    </div>\r\n"
			+ "</body>\r\n"
			+ "</html>");

	return s.toString();
}



	public String createIndex() {
		StringBuilder s= new StringBuilder();
		s.append("<html lang=\"it\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Rubrica</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
				+ "    \r\n"
				+ "    <div id=\"conteiner\"> \r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
				+ "    <table class=\"minimalistBlack\">\r\n"
				+ "        <thead>\r\n"
				+ "        <tr>\r\n"
				+ "        <th>Nome</th>\r\n"
				+ "        <th>Cognome</th>\r\n"
				+ "        <th>Email</th>\r\n"
				+ "        <th>Telefono</th>\r\n"
				+ "        <th>Elimina</th>\r\n"
				+ "        <th>Modifica</th>\r\n"
				+ "\r\n"
				+ "        </tr>\r\n"
				+ "        </thead>\r\n"
				+ "       <tbody>\r\n");
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
					+ "        <td><a href=\"modifica.html?id="+x.getId()+"\">mod</a></td>\r\n"
					+ "        </tr>");
		}
		s.append("  </tbody>\r\n"
				+ "        </table>\r\n"
				+ "<a href=\"insertForm.html\">Inserisci contatto</a>\r\n"
				+ "<a href=\"ricercaContatto.html\">Ricerca contatto</a>"
				
				+ "</div>\r\n"
				+ "\r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		return s.toString();
	}
	public String pageModifica(int id) {
		JPAManager jpa= new JPAManager();
	Contatto x=	jpa.returnContatto(id);
	
		StringBuilder s= new StringBuilder();
		s.append("<html lang=\"it\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Rubrica</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
				+ "    \r\n"
				+ "    <div id=\"conteiner\"> \r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
				+ "     \r\n"
				+ "    <form action=\"./modifica.html\" method=\"post\">\r\n"
				+ "   <fieldset>\r\n"
				+ "        <legend>Compila i campi</legend>\r\n"
				+ "        <input type=\"text\" name=\"id\" style=\"display: none;\" value=\""+x.getId()+" \">\r\n"
				+ "    <label for=\"name\">Nome:   </label> <input type=\"text\" name=\"name\"class=\"input\"required value=\""+x.getNome()+" \">  <br>\r\n"
				+ "    <label for=\"name\">Cognome:   </label> <input type=\"text\" name=\"surname\"class=\"input\" required value=\""+x.getCognome()+"  \"> <br>\r\n"
				+ "    <label for=\"name\">Email:   </label> <input type=\"text\" name=\"email\"class=\"input\" required value=\""+x.getEmail()+ " \"> <br>\r\n"
				+ "    <label for=\"name\">Telefono:   </label> <input type=\"text\" name=\"tel\"class=\"input\" required value=\""+x.getTel()+" \">  <br>\r\n"
				+ "<button class=\"button\"type=\"submit\">Salva Contatto</button>\r\n"
				+ "    </fieldset>\r\n"
				+ "    </form>\r\n"
				+ "   \r\n"
				+ "  <a href=\"index.html\">Torna Indietro</a>\r\n"
				+ "    <a href=\"ricercaContatto.html\">Ricerca contatto</a>"
				+ "</div>\r\n"
				+ "\r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		return s.toString();
	}
	public String pageModificaok(int id) {
		JPAManager jpa= new JPAManager();
	Contatto x=	jpa.returnContatto(id);
	
		StringBuilder s= new StringBuilder();
		s.append("<html lang=\"it\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Rubrica</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div id=\"head\"> <h1>Rubrica</h1></div>\r\n"
				+ "    \r\n"
				+ "    <div id=\"conteiner\"> \r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "<div class=\"divlat\" style=\"width: 90%; background-color: white;\">\r\n"
				+ "     \r\n"
				+ "    <form action=\"./modifica.html\" method=\"post\">\r\n"
				+ "   <fieldset>\r\n"
				+ "        <legend>Compila i campi</legend>\r\n"
				+ "        <input type=\"text\" name=\"id\" style=\"display: none;\" value=\""+x.getId()+" \">\r\n"
				+ "    <label for=\"name\">Nome:   </label> <input type=\"text\" name=\"name\"class=\"input\"required value=\""+x.getNome()+" \">  <br>\r\n"
				+ "    <label for=\"name\">Cognome:   </label> <input type=\"text\" name=\"surname\"class=\"input\" required value=\""+x.getCognome()+"  \"> <br>\r\n"
				+ "    <label for=\"name\">Email:   </label> <input type=\"text\" name=\"email\"class=\"input\" required value=\""+x.getEmail()+ " \"> <br>\r\n"
				+ "    <label for=\"name\">Telefono:   </label> <input type=\"text\" name=\"tel\"class=\"input\" required value=\""+x.getTel()+" \">  <br>\r\n"
				+ "<button class=\"button\"type=\"submit\">Salva Contatto</button>\r\n"
				+ "<p style=\"color:green\">Contatto modificato correttamente</p>\r\n"
				+ "    </fieldset>\r\n"
				+ "    </form>\r\n"
				+ "   \r\n"
				+ "  <a href=\"index.html\">Torna Indietro</a>\r\n"
				+ "    <a href=\"ricercaContatto.html\">Ricerca contatto</a>"
			
				+ "</div>\r\n"
				+ "\r\n"
				+ "<div class=\"divlat\">\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		return s.toString();
	}
	public static void main(String ...strings ) {
		System.out.println(new CreatorHTML().createpageAggiunto());
	}
}
