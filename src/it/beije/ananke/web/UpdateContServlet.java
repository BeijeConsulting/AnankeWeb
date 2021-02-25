package it.beije.ananke.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.managerdb.JPAmanager;
import it.beije.ananke.rubrica.Contatto;

/**
 * Servlet implementation class UpdateContServlet
 */
@WebServlet("/updateContServlet")
public class UpdateContServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContServlet() {
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
		// TODO Auto-generated method stub

			Contatto contatto = new Contatto();
			
			contatto.setName(request.getParameter("name"));
			contatto.setSurname(request.getParameter("surname"));
			contatto.setTelephone(request.getParameter("telephone"));
			contatto.setEmail(request.getParameter("email"));
			
			if(JPAmanager.modificaContatto(contatto))
			{
				response.sendRedirect("visualizzaRubrica.jsp");
			}
			else
			{
				response.getWriter().append("<html><head><title>Modifica fallita</title>" + 
						"</head><body><h1>Modifica non riuscita</h1>"
						+ "</body></html>");
			}
			
			
		}
	}


