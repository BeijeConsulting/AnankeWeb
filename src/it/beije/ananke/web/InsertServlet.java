package it.beije.ananke.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.rubrica.Contact;
import it.beije.ananke.rubrica.rubricajpa.Rubrica;
import it.beije.ananke.rubrica.rubricajpa.jpamanager.JPAManager;

@WebServlet("/servlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertServlet() {
        super();
        System.out.println("Costruttore TestServlet...");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL() + " doGet");
		
		LocalDateTime now = LocalDateTime.now();
		
		String html = "<html><head><title>Servlet di prova</title>" + 
				"</head><body><h1>CIAO ANANKE :-)</h1>"
				+ "<p>Data esatta: " + now + "</p></body></html>";
		
		response.getWriter().append(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL() + " doPost");
		Contact contact = new Contact();
		contact.setFirstName(request.getParameter("nome"));
		contact.setLastName(request.getParameter("cognome"));
		contact.setPhoneNumber(request.getParameter("numero"));
		contact.setEmail(request.getParameter("email"));
		JPAManager.insert(contact);
		
	
		response.sendRedirect("InitialPage.html");
	}

}
