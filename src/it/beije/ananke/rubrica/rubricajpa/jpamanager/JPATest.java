package it.beije.ananke.rubrica.rubricajpa.jpamanager;

import it.beije.ananke.rubrica.Contact;

public class JPATest {
	public static void main(String[] args) {
		Contact c = new Contact();
		c.setFirstName("Francesco");
		c.setEmail("fg@gmail.com");
		c.setLastName("giannini");
		c.setPhoneNumber("3352569475");
		JPAManager.insert(c);
	}
	
}
	
