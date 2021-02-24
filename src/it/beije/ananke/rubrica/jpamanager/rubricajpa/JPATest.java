package it.beije.ananke.rubrica.jpamanager.rubricajpa;

import it.beije.ananke.rubrica.Contact;

public class JPATest {
	public static void main(String[] args) {
		Contact c = JPAManager.selectByField("id", "25").get(0);
		System.out.println(c);
		c.setFirstName("Stefano");
		c.setEmail("fg@gmail.com");
		c.setLastName("giannini");
		c.setPhoneNumber("3352569475");
		System.out.println(c);
		JPAManager.update(c);
		Contact c1 = JPAManager.selectByField("id", "25").get(0);
		System.out.println(c1);
	}
	
}
	
