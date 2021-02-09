package it.beije.ananke.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/servlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public TestServlet() {
//        super();
//        System.out.println("Costruttore TestServlet...");
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System	.out.println(request.getRequestURL() + " doGet");
		
		response.getWriter().append("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		String html = "<html><head><title>Servlet di prova</title>" + 
//				"</head><body>"
//				+ "<p>COGNOME : " + cognome + "<br>"
//				+ "NOME : " + nome + "</p>"
//				+ "</body></html>";
//		response.getWriter().append(html);

		HttpSession session = request.getSession();
		session.setAttribute("cognome", cognome);
		session.setAttribute("nome", nome);
		System.out.println("ID SESSION : " + session.getId());
		
		response.sendRedirect("dati.jsp");
	}

}
