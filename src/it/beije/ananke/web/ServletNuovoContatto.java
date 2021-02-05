package it.beije.ananke.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.web.rubrica.RubricaJPA;

/**
 * Servlet implementation class ServletNuovoContatto
 */
@WebServlet("/ServletNuovoContatto")
public class ServletNuovoContatto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String numTel = request.getParameter("numTel");
		String mail = request.getParameter("mail");
		
		boolean result = RubricaJPA.inserisciContatto(nome, cognome, numTel, mail);
		
		if(result == true) {
			
			String htmlOK = "<html><head><title>Servlet di prova</title>" + 
					"</head><body>"
					+ "<p>" 
					+ "CONTATTO INSERITO CON SUCCESSO" + "</p>"
					+ "</body></html>";

			response.getWriter().append(htmlOK);
				
		}else {
			
			String htmlFAIL = "<html><head><title>Servlet di prova</title>" + 
					"</head><body>"
					+ "<p>" 
					+ "ERRORE DURANTE L'INSERIMENTO" + "</p>"
					+ "</body></html>";

			response.getWriter().append(htmlFAIL);
			
		}
	}

}
