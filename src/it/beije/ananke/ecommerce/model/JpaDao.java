package it.beije.ananke.ecommerce.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class JpaDao implements Dao<Object> {

	@Override
	public void persist(Object entity) {
		EntityManager entityManager = EcommerceEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
	}

	@Override
	public void remove(Object entity) {
		EntityManager entityManager = EcommerceEntityManager.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entity);
		entityTransaction.commit();
		entityManager.close();
	}

	@Override
	public Object findById(Class c, int id) {
		EntityManager entityManager = EcommerceEntityManager.getEntityManager();
		Object o = entityManager.find(c, id);
		return o;
	}
	
	@Override
	public List selectAll(Class c, String ordering) {
		EntityManager entityManager = EcommerceEntityManager.getEntityManager();
		System.out.println(c.getName());
		String jpqlSelect = "SELECT c FROM " + c.getName() + " as c ORDER BY " + ordering;
		Query query = entityManager.createQuery(jpqlSelect);
		List entities = query.getResultList();
		return entities;
	}

	@Override
	public List selectByField(Class c, String field, String search) {
		EntityManager entityManager = EcommerceEntityManager.getEntityManager();
		System.out.println(c.getName());
		String jpqlSelect = "SELECT c FROM " + c.getName() + " as c WHERE " + field + " = '" + search + "'";
		Query query = entityManager.createQuery(jpqlSelect);
		List entities = query.getResultList();
		return entities;
	}

	
}
