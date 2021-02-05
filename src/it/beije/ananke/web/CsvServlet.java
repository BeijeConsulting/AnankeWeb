package it.beije.ananke.web;

import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CsvServlet
 */
@WebServlet("/csv")
public class CsvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI() + " doGet");
		
		String csv = "C:/Users/Padawan06/Desktop/rubrica.csv";
		
		
		FileReader fileReader = new FileReader(csv);
		//response.setContentType("text/csv");
		while (fileReader.ready()) {
			response.getWriter().append((char)fileReader.read());
		}
	}

}
