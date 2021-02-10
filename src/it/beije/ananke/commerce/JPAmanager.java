package it.beije.ananke.commerce;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import it.beije.ananke.rubrica.RubricaEntityManager;

public class JPAmanager {

	public void aggiungiUser(UserBean user) {
		EntityManager em = RubricaEntityManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
		System.out.println("La voce è stata inserita correttamente.");
		em.close();
	}
	
	
	public boolean controlloEmail(String s) {
		List<UserBean> list = new ArrayList<>();
		String jqlSelect = "SELECT u FROM UserBean as u WHERE email = '" + s +"'";
		EntityManager em = RubricaEntityManager.getEntityManager();
		Query query = em.createQuery(jqlSelect);
		list = query.getResultList();
		em.close();
		if(list.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public UserBean login(String email, String pswd) {
		List<UserBean> list = new ArrayList<>();
		String jqlSelect = "SELECT u FROM UserBean as u WHERE email = '" + email +"'";
		EntityManager em = RubricaEntityManager.getEntityManager();
		Query query = em.createQuery(jqlSelect);
		list = query.getResultList();
		if(list.size() == 0) {
			return null;
		}else {
			return list.get(0);
		}	
	}
	
	
	public List<ProductBean> letturaProdotti(){
		List<ProductBean> list = new ArrayList<>();
		String jqlSelect = "SELECT p FROM ProductBean as p";
		EntityManager em = RubricaEntityManager.getEntityManager();
		Query query = em.createQuery(jqlSelect);
		list = query.getResultList();
		return list;
	}
	
	
	public OrderBean creaOrdine() {
		OrderBean order = new OrderBean();
		return order;
	}
}
