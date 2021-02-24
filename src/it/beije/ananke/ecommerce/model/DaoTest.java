package it.beije.ananke.ecommerce.model;

import java.util.List;

import it.beije.ananke.ecommerce.entities.Product;
import it.beije.ananke.ecommerce.entities.User;

public class DaoTest {
	public static void main(String[] args) {
		Product p = new Product();
//		p.setDescription("costoso");
//		p.setName("Iphone");
//		p.setPrice(1299.99);
		JpaDao dao = new JpaDao();
//		dao.persist((Object) p);
		
		List<Product> list = dao.selectByField(p.getClass(), "description", "costoso");
		for(Product pr : list) {
			System.out.println(pr.getDescription());
		}
		
	}
}
