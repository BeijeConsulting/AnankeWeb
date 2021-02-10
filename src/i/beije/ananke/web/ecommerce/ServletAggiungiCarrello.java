package i.beije.ananke.web.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletAggiungiCarrello
 */
@WebServlet("/ServletAggiungiCarrello")
public class ServletAggiungiCarrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletAggiungiCarrello() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int UserId = Integer.parseInt((String)session.getAttribute("UserId"));
		
		response.sendRedirect("./catalogo.jsp");
	}

}
