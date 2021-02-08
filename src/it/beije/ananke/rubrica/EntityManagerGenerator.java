package it.beije.ananke.rubrica;

import javax.persistence.*;


public class EntityManagerGenerator {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManagerGenerator() {
		
	}
	
	public static EntityManager getEntityManager() {
		if(entityManagerFactory == null || !entityManagerFactory.isOpen()) 
			entityManagerFactory = Persistence.createEntityManagerFactory("Rubrica");
		return entityManagerFactory.createEntityManager();
	}
}
