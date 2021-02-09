//package it.beije.ananke.web;
//
//import java.io.FileReader;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import it.beije.ananke.rubrica.JPAmanager;
//
///**
// * Servlet implementation class CsvServlet
// */
//@WebServlet("/lettura")
//public class ReadServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getRequestURI() + " doGet");
//		JPAmanager j = new JPAmanager();
//	//	j.read();
//		String html = "<!DOCTYPE html>\r\n"
//				+ "<html>\r\n"
//				+ "<body>\r\n"
//				+ "\r\n"
//				+ "<h2>CONTATTI IN RUBRICA:</h2>\r\n"
//				+ "\r\n"
//				+ "<form action=\"./lettura method=\"get\">"
//				+ "<textarea name=\"message\" rows=\"10\" cols=\"30\">\r\n"
//				+ "STAMPO LA RUBRICA:\r\n"
//				+ j.read()
//				+ "\r\n"
//				+ "\r\n"
//				+ "</textarea>\r\n"
//				+ "</form> \r\n"
//				+ "\r\n"
//				+ "</body>\r\n"
//				+ "</html>\r\n";
//			response.getWriter().append(html);
//		}
//}
