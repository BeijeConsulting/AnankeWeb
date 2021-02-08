package anankeweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.beije.ananke.rubrica.*;
/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html = "<a href=" +"index.html"+"><button>Home</button></a><p><a href=" +"insertcontact.html"+"><button>Inserisci Ancora</button></a></p>";
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contatti c = new Contatti();
		c.setName(request.getParameter("name"));
		c.setSurname(request.getParameter("surname"));
		c.setEmail(request.getParameter("email"));
		c.setTelephone(request.getParameter("telephone"));
		
		JPAManager.insertContact(c);
		doGet(request, response);
	}

}
