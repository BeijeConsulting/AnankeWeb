package it.beije.ananke.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        System.out.println("Costruttore TestServlet...");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL() + " doGet");
		
		LocalDateTime now = LocalDateTime.now();
		
		String html = "<html><head><title>Servlet di prova</title>" + 
				"</head><body><h1>CIAO ANANKE :-)</h1>"
				+ "<p>Data esatta: " + now + "</p></body></html>";
		
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL() + " doPost");
		
		String cognome = request.getParameter("cognome");
		String nome = request.getParameter("nome");
		System.out.println("cognome = " + cognome);
		System.out.println("nome = " + nome);

		String html = "<html><head><title>Servlet di prova</title>" + 
				"</head><body>"
				+ "<p>COGNOME : " + cognome + "<br>"
				+ "NOME : " + nome + "</p>"
				+ "</body></html>";

		response.getWriter().append(html);
		
		//response.sendRedirect("index.html");
	}

}
