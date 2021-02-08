package it.beije.ananke.rubrica;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;



public class JPAManager {

	
	public static List<Contatti> getAllUsers() {
		EntityManager em = EntityManagerGenerator.getEntityManager();
		String jpqlSelect = "SELECT c FROM Contatti as c";
		Query query = em.createQuery(jpqlSelect);
		List<Contatti> contacts = query.getResultList();
		em.close();
		return contacts;
	}
	
	public static void insertContact(Contatti c) {
		EntityManager em = EntityManagerGenerator.getEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		em.persist(c);
		t.commit();
		em.close();
	
	}
	
	public static List<Contatti> containContacts(String field) {
		List<Contatti> contacts = getAllUsers();
		List<Contatti> foundcontacts = new ArrayList<>();
		System.out.println("Qui ci sto");
		for(Contatti c : contacts) {
			if(c.searchProperties(field)) {
				foundcontacts.add(c);
			}
		}
		System.out.println(foundcontacts);
		return foundcontacts;
	}
	
	public static boolean deleteContacts(Contatti c) {
		EntityManager em = EntityManagerGenerator.getEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.remove(em.find(Contatti.class, c.getId()));
		t.commit();
		return true;
		
	}
}
