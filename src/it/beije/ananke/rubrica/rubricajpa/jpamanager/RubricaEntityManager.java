package it.beije.ananke.rubrica.rubricajpa.jpamanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class RubricaEntityManager {
	
	private RubricaEntityManager() {}
	
	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManager getEntityManager() {
		if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
			entityManagerFactory = Persistence.createEntityManagerFactory("Rubrica");
		}
		
		return entityManagerFactory.createEntityManager();
	}

}
