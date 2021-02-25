package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Contatto;
import models.JPAManager;

/**
 * Servlet implementation class Inserisci
 */
@WebServlet("/inserisci")
public class Inserisci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inserisci() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getRequestURL() + " doPost");
		JPAManager c= new JPAManager();
		Contatto cz= new Contatto();
		cz.setNome(request.getParameter("name"));
		cz.setCognome(request.getParameter("surname"));
		cz.setEmail(request.getParameter("email"));
		cz.setTel(request.getParameter("tel"));
		System.out.println(cz.toString());
		c.addContatto(cz);


	}

}
