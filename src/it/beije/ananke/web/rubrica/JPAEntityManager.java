package it.beije.ananke.web.rubrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManager {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	private JPAEntityManager() {}
	
	public static EntityManager getEntityManager() {
		
		if(entityManager == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce");
			entityManager = entityManagerFactory.createEntityManager();
		}
		
		return entityManager;
		
	}
	
	
	
	
	

}
