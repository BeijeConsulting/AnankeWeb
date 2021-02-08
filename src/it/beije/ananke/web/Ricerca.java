package it.beije.ananke.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ricerca
 */
@WebServlet("/ricercaContatto.html")
public class Ricerca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ricerca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getRequestURL() + " doPost");
		CreatorHTML creatore= new CreatorHTML();
		response.getWriter().append(creatore.ricercaForm());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreatorHTML creatore= new CreatorHTML();
		response.getWriter().append(creatore.ricercaFormResult(request.getParameter("name"), request.getParameter("surname"), request.getParameter("email"), request.getParameter("tel")));
	
	}

}
