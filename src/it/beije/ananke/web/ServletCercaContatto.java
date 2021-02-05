package it.beije.ananke.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.web.rubrica.Contatto;
import it.beije.ananke.web.rubrica.RubricaJPA;

/**
 * Servlet implementation class ServletCercaContatto
 */
@WebServlet("/ServletCercaContatto")
public class ServletCercaContatto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parolaChiave = request.getParameter("parolaChiave");
		
		List<Contatto> list = new ArrayList<>();
		
		list = RubricaJPA.cercaContatti(parolaChiave);
		
		if(list == null) {
			String htmlFAIL = "<html><head><title>Servlet di prova</title>" + 
					"</head><body>"
					+ "<p>" 
					+ "NESSUN CONTATTO TROVATO!" + "</p>"
					+ "</body></html>";

			response.getWriter().append(htmlFAIL);

		}else {
			
			for(Contatto c : list) {
				response.getWriter().append(c.getNome() + " ; " + c.getCognome() + " ; "
												+ c.getNumeroTel() + " ; " + c.getMail() + "\n");
			}
			
		}
	}

}
