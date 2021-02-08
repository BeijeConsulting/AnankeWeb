package anankeweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.rubrica.*;



/**
 * Servlet implementation class RubricaServlet
 */
@WebServlet("/rubricaServlet")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html = "<table><tr><th>Name</th><th>Surname</th><th>Email</th><th>Telephone</th</tr>";
		html += getRows();
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		callService(request,response);
		
	}
	
	protected void callService(HttpServletRequest request , HttpServletResponse response) throws IOException {
		String s = request.getParameter("service");
		switch(s) {
		case "1":
			response.sendRedirect("insertcontact.html");
			break;
		case "2":
			response.sendRedirect("deletecontacts.html");
			break;
		case "3":
			response.sendRedirect("exportfile.html");
			break;
		case "4":
			try {
				doGet(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			break;
		}
	}
	protected String getRows() {
		List<Contatti> l = new ArrayList<>();
		l = JPAManager.getAllUsers();
		String html="";
		for(Contatti c : l) {
			html += "<tr><td>"+ c.getName() + "</td> <td>"+ c.getSurname() + "</td><td>"+ c.getEmail() + "</td><td>"+ c.getTelephone() + "</td></tr>";
		}
		html += "</table>";
		return html;
	}

}
