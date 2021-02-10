package it.beije.ananke.commerce;

import java.io.IOException;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.rubrica.RubricaEntityManager;

/**
 * Servlet implementation class ServletSignUp
 */
@WebServlet("/ServletSignUp")
public class ServletSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JPAmanager m = new JPAmanager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSignUp() {
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
		doGet(request, response);
		if(m.controlloEmail(request.getParameter("email"))) {
			m.aggiungiUser(defUser(request));
		}else {
			response.sendRedirect("registrati.html");
		}
	}
	
	
	public UserBean defUser(HttpServletRequest request) {
		UserBean bean = new UserBean();
		bean.setEmail(request.getParameter("email"));
		bean.setFirstName(request.getParameter("name_param"));
		bean.setSecondName(request.getParameter("surname_param"));
		bean.setPassword(request.getParameter("password"));
		return bean;
	}

}
