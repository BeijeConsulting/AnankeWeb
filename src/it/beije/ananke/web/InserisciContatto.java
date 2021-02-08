package it.beije.ananke.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.database.JPAManager;
import it.beije.ananke.rubrica.Contatto;


@WebServlet("/inserisci")
public class InserisciContatto extends HttpServlet {
	
	JPAManager managerJPA = new JPAManager();
	
	private static final long serialVersionUID = 102831973239L;
 
    public InserisciContatto() {
        super();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getRequestURL() + " doGet");
		
		LocalDateTime now = LocalDateTime.now();
		
		String html = "<html><head><title>Servlet di prova</title>" + 
				"</head><body><h1>CIAO ANANKE :-)</h1>"
				+ "<p>Data esatta: " + now + "</p></body></html>";
		
		response.getWriter().append(html);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getRequestURL() + " doPost");
	
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		
		Contatto contatto = new Contatto(nome, cognome, telefono, email);
		
		managerJPA.inserisciContattoDb(contatto);
		
		System.out.println("");
		System.out.println("Dati del nuovo contatto");
		System.out.println("nome: " + nome);
		System.out.println("cognome: " + cognome);
		System.out.println("telefono: " + telefono);
		System.out.println("email: " + email);
		
		response.sendRedirect("index.html");
		
	}

}
