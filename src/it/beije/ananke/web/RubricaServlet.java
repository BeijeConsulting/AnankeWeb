package it.beije.ananke.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.managerdb.JPAmanager;
import it.beije.ananke.rubrica.Contatto;

/**
 * Servlet implementation class RubricaServlet
 */
@WebServlet("/servletRub")
public class RubricaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RubricaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		Contatto co = new Contatto();
//		
//		co.setName(request.getParameter("name"));
//		co.setSurname(request.getParameter("surname"));
//		co.setTelephone(request.getParameter("telephone"));
//		co.setEmail(request.getParameter("email"));
//		
//		if(JPAmanager.aggiungiContatto(co))
//		{	
//			String html = "<html><head><title>Servlet di prova</title>" + 
//					"</head><body><h1>Contatto aggiunto :-)</h1>"
//					+ "</body></html>";
//			response.getWriter().append(html);
//		}
//		else response.getWriter().append("<html><head><title>Servlet di prova</title>" + 
//					"</head><body><h1>Contatto non aggiunto :-)</h1>"
//					+ "</body></html>");
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contatto co = new Contatto();
		
		co.setName(request.getParameter("name"));
		co.setSurname(request.getParameter("surname"));
		co.setTelephone(request.getParameter("telephone"));
		co.setEmail(request.getParameter("email"));
		
		if(JPAmanager.aggiungiContatto(co))
		{	
			String html = "<html><head><title>Servlet di prova</title>" + 
					"</head><body><h1>Contatto aggiunto :-)</h1>"
					+ "</body></html>";
			response.getWriter().append(html);
		}
		else response.getWriter().append("<html><head><title>Servlet di prova</title>" + 
					"</head><body><h1>Contatto non aggiunto :-)</h1>"
					+ "</body></html>");
	}

}
