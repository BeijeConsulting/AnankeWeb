package it.beije.ananke.rubrica.jpamanager.rubricajpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class JPAManager {
//	public static EntityManager entityManager = RubricaEntityManager.getEntityManager();

	public static <T> void insert(T t) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		entityManager.close();

	}

	public static <T> void update(T t) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		entityManager.close();
	}

	public static <T> void remove(T t) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(/*entityManager.find(Contact.class, contact.getId())*/);
		entityTransaction.commit();
		entityManager.close();
	}

	public static <T> List<T> selectAll(String table, String ordering) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();

		String jpqlSelect = "SELECT c FROM " + table + " as c ORDER BY " + ordering;
		Query query = entityManager.createQuery(jpqlSelect);
		List<T> ts = query.getResultList();

		for (T t : ts) {
			System.out.println(t);
		}

		entityManager.close();
		return ts;
	}

	public static <T> List<T> selectByField(String table, String field, String search) {
		EntityManager entityManager = RubricaEntityManager.getEntityManager();
		List<T> ts = new ArrayList<T>();
		if (!field.equalsIgnoreCase("id")) {
			String jpqlSelect = "SELECT c FROM " + table + " as c WHERE " + field + " = '" + search + "'";
			Query query = entityManager.createQuery(jpqlSelect);
			ts = query.getResultList();
			for (T t : ts) {
				System.out.println(t);
			}
		}
		return ts;
	}

	public static <T> T selectById(String table, String id) {
		T t = entityManager.find(Contact.class, Integer.parseInt(search));
		t.add(contact);
	}

}
