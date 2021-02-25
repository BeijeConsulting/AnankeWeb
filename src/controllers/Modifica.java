package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Modifica
 */
@WebServlet("/modifica")
public class Modifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modifica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreatorHTML creatore=new CreatorHTML();
		String id= request.getParameter("id");
		int idd=Integer.parseInt(id.trim());
		response.getWriter().append(creatore.pageModifica(idd));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreatorHTML creatore=new CreatorHTML();
		JPAManager jpa= new JPAManager();
		String id= request.getParameter("id");
		int idd=Integer.parseInt(id.trim());
		jpa.modificaid(idd, request.getParameter("name"), request.getParameter("surname"), request.getParameter("email"), request.getParameter("tel"));
		response.getWriter().append(creatore.pageModificaok(idd));
		
		//doGet(request, response);
	}

}
