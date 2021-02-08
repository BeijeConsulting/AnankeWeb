package it.beije.ananke.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.rubrica.Contact;
import it.beije.ananke.rubrica.rubricajpa.jpamanager.JPAManager;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintServlet() {
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
		System.out.println(request.getRequestURL() + " doPost");
		List<Contact> contacts = JPAManager.selectAll();
		
		String html = "<!DOCTYPE html>" + "<html>"	+ "<head>" 	+ "<meta charset=\"ISO-8859-1\">"  + "<title>Contacts</title>"
				+ "</head>"	+ "<body>" + "<table>";
		for(Contact c : contacts) {
			html += "<tr><th>" + c.getFirstName() + "</th><th>" + c.getLastName() +"</th><th> " + c.getPhoneNumber() 
				+"</th><th>" + c.getEmail() + "</tr>";
		}
		
		html+= "</table></div></body></html>";
		
		response.getWriter().append(html);
	
//		response.sendRedirect("InitialPage.html");
	}

}
