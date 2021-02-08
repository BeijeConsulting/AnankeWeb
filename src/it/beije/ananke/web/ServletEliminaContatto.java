package it.beije.ananke.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.ananke.web.rubrica.Contatto;
import it.beije.ananke.web.rubrica.RubricaJPA;

/**
 * Servlet implementation class ServletEliminaContatto
 */
@WebServlet("/ServletEliminaContatto")
public class ServletEliminaContatto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parolaChiave = request.getParameter("parolaChiave");
		
		List<Contatto> list = new ArrayList<>();
		
		list = RubricaJPA.cercaContatti(parolaChiave);
		
	}

}
