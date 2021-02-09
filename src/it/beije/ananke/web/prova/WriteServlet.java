package it.beije.ananke.web.prova;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.rubrica.prova.JPAmanager;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/servlet")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println(request.getRequestURL() + " doGET");
//		String nome = request.getParameter("nome");
//		String cognome = request.getParameter("cognome");
//		String telefono = request.getParameter("telefono");
//		String email = request.getParameter("email");
//		System.out.println("nome = " + nome);
//		System.out.println("cognome = " + cognome);
//		System.out.println("telefono = " + telefono);
//		System.out.println("email = " + email);
//
//		String html = "<html><head><title>Servlet di scrittura</title>" + 
//				"</head><body action=\"./lettura method=\"post\">"
//				+ "<p>COGNOME : " + cognome + "<br>"
//				+ "NOME : " + nome + "</p>"
//					+ "TELEFONO : " + telefono + "</p>"
//						+ "EMAIL : " + email + "</p>"
//				+ "</body></html>";
		
//JPAmanager j = new JPAmanager();
//j.inserimento(nome, cognome ,telefono, email);

	//	response.getWriter().append(html);
		//response.sendRedirect("index.html");
		
//			String html = "<html><head><title>Servlet di scrittura</title>" + 
//				"</head><body action=\"./lettura method=\"post\">"
//				+ "name<input type=text name=nome value= placeholder= /><br>"
//				+"<input type=text name=cognome value= placeholder= /><br />"
//				+"<input type=text name=telefono value= placeholder= /><br>"
//				+"<input type=text name=email value= placeholder= /><br>"
//				+"<input type=submit value=INVIO />"
//				+ "</form></body></html>";
//			String nome = request.getParameter("nome");
//			String cognome = request.getParameter("cognome");
//			String telefono = request.getParameter("telefono");
//			String email = request.getParameter("email");
//			
//			String html2 = "<html><head><title>Servlet di scrittura</title>" + 
//					"</head><body action=\"./lettura method=\"post\">"
//					+ "<p>COGNOME : " + cognome + "<br>"
//					+ "NOME : " + nome + "</p>"
//						+ "TELEFONO : " + telefono + "</p>"
//							+ "EMAIL : " + email + "</p>"
//					+ "</body></html>";
//			
//			System.out.println("nome = " + nome);
//			System.out.println("cognome = " + cognome);
//			System.out.println("telefono = " + telefono);
//			System.out.println("email = " + email);
//JPAmanager j = new JPAmanager();
//j.inserimento(nome, cognome ,telefono, email);
//
//		response.getWriter().append(html2);
//		//response.sendRedirect("http://localhost:8080/AnankeWeb/index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL() + " doPost");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		System.out.println("nome = " + nome);
		System.out.println("cognome = " + cognome);
		System.out.println("telefono = " + telefono);
		System.out.println("email = " + email);

		String html = "<html><head><title>Servlet di scrittura</title>" + 
				"</head><body action=\"./lettura method=\"post\">"
				+ "<p>COGNOME : " + cognome + "<br>"
				+ "NOME : " + nome + "</p>"
					+ "TELEFONO : " + telefono + "</p>"
						+ "EMAIL : " + email + "</p>"
				+ "</body></html>";
		
//JPAmanager j = new JPAmanager();
//j.inserimento(nome, cognome ,telefono, email);

		//response.getWriter().append(html);
		response.sendRedirect("index.html");
	}

}
