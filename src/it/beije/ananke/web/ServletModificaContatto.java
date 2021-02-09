package it.beije.ananke.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.beije.ananke.web.rubrica.Contatto;
import it.beije.ananke.web.rubrica.RubricaJPA;

/**
 * Servlet implementation class ServletModificaContatto
 */
@WebServlet("/ServletModificaContatto")
public class ServletModificaContatto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModificaContatto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Contatto> list = RubricaJPA.cercaContatti(request.getParameter("parolaChiave"));
		HttpSession session = request.getSession();
		session.setAttribute("listC", list);
		response.sendRedirect("./Modifica.jsp");
		//doGet(request, response);
	}

}
