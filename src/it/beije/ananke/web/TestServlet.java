package it.beije.ananke.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println(request.getRequestURL() + " doPost");
	JPAManager c= new JPAManager();
	Contatto cz= new Contatto();
	cz.setNome(request.getParameter("name"));
	cz.setCognome(request.getParameter("surname"));
	cz.setEmail(request.getParameter("email"));
	cz.setTel(request.getParameter("tel"));
	System.out.println(cz.toString());
	c.addContatto(cz);
	CreatorHTML creatore= new CreatorHTML();
	response.getWriter().append(creatore.createpageAggiunto());
	

	

		
	}

}
