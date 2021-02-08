package it.beije.ananke.web;
import java.util.List;

import it.beije.ananke.web.rubrica.*;

public class HTMLmanager {
	
	public static String pagHtmlVisualizza(List<Contatto> list) {
		
		String html = "<html><head><title> </title>" + 
				"</head><body>";
		
		for(Contatto c : list)
			html += "<p>" + " NOME : " + c.getCognome() +
							" COGNOME : " + c.getCognome() + 
							" NUMERO DI TELEFONO : " + c.getNumeroTel() +
							" EMAIL : " + c.getMail()
										+ "</p>"
										+ "<br>";
			
			
					html +=   "</body></html>";
		
		return html;
		
	}

}
