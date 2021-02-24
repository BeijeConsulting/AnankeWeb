package it.beije.ananke.ecommerce.model;

import java.util.List;

public interface Dao <E> {
	void persist(E entity);
	void remove(E entity);
	E findById(Class c, int id);
	List<E> selectAll(Class c, String ordering);
	List<E> selectByField(Class c, String field, String search);
}
