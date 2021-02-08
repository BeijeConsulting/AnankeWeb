package it.beije.ananke.managerdb;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import it.beije.ananke.rubrica.Contatto;

//import it.beije.ananke.Contatto;

public class JPAmanager {


	public static boolean aggiungiContatto(Contatto contatto) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Contatto cont = contatto;

			if(cont!=null)
			{
			// opening the transaction
			entityTransaction.begin();
			entityManager.persist(cont);
			entityTransaction.commit();
			entityManager.close();
	
			return true;
			}
			else return false;
	}

	public static List<Contatto> cercaContatto(String field) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		
		String JPASelect = "SELECT c FROM Contatto as c WHERE name='"+field+"' OR surname='"+field+"' OR telephone='"+field+"' OR"
				+ "email='"+field+"'";
				
		Query query = entityManager.createQuery(JPASelect);
		List<Contatto> contatti = query.getResultList();

		if (contatti.isEmpty()) {
			
			entityManager.close();
			return null;
		}
		
		else
		{
			entityManager.close();
			return contatti;
		}
		

	}

//	public static boolean modificaContatto(Contatto contatto) {
//
//			EntityManager entityManager = RubricaEntityManager.getEntityManager();
//			EntityTransaction entityTransaction = entityManager.getTransaction();
//			
//			List<Contatto> contatti = cercaContatto(contatto);
//			
//			if(cont!=null)
//			{
//				entityTransaction.begin();
//				cont.setName(contatto.getName());
//				cont.setSurname(contatto.getSurname());
//				cont.setTelephone(contatto.getTelephone());
//				cont.setEmail(contatto.getEmail());
//				
//				entityManager.persist(cont);
//				entityTransaction.commit();
//				entityManager.close();
//				return true;
//			}
//
//			else return false;
//	}
//
//	public static boolean eliminaContatto(Contatto contatto) {
//
//		EntityManager entityManager = RubricaEntityManager.getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		
//		Contatto cont = cercaContatto(contatto);
//		
//		if(cont!=null)
//		{
//			entityTransaction.begin();
//			entityManager.remove(cont);
//			entityTransaction.commit();
//			entityManager.close();
//			return true;
//		}
//
//		else return false;
//}

//	public static void exportDB() throws Exception {
//		EntityManager entityManager = RubricaEntityManager.getEntityManager();
//		String result, last3, xml = "xml", csv = "txt";
//		String JPASelect = "SELECT c FROM Contatto as c";
//		Query query = entityManager.createQuery(JPASelect);
//		List<Contatto> contatti = query.getResultList();
//
//		System.out.println("Inserisci il path in cui esportare la rubrica:");
//		result = input.nextLine();
//		last3 = result.substring(result.length() - 3);
//
//		if (last3.equals(xml)) {
//			RubricaXML.writeContactXML((ArrayList<Contatto>) contatti, result);
//		} else if (last3.equals(csv)) {
//			Rubrica.writeContacts(new File(result), (ArrayList<Contatto>) contatti);
//		}
//
//		entityManager.close();
//	}
//
//	public static void importOnDB(Scanner input) throws ParserConfigurationException, SAXException, IOException {
//		String path, last3, xml = "xml", csv = "txt";
//		System.out.println("Inserisci il path della rubrica da importare:");
//		path = input.nextLine();
//		last3 = path.substring(path.length() - 3);
//		ArrayList<Contatto> contatti = null;
//
//		if (last3.equals(xml)) {
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			Document document = builder.parse(path);
//			contatti = RubricaXML.readContactsXML(document);
//		} else if (last3.equals(csv)) {
//			contatti = Rubrica.readContacts(new File(path));
//		}
//
//		EntityManager entityManager = RubricaEntityManager.getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//
//		for (Contatto con : contatti) {
//			entityTransaction.begin();
//			entityManager.persist(con);
//			entityTransaction.commit();
//		}
//		System.out.println("Rubrica importata su db.");
//
//		entityManager.close();
//	}

}
