package com.castro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.castro.dto.Address;
import com.castro.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("First User");

		UserDetails user2 = new UserDetails();
		user2.setUserName("Second User");
		
		Address address1 = new Address();
		address1.setStreet("La Trobe");
		address1.setCity("Melbourne");
		address1.setState("Victoria");
		address1.setZipCode("3000");
		
		Address ofcAddress1 = new Address();
		ofcAddress1.setStreet("Bourke");
		ofcAddress1.setCity("Melbourne");
		ofcAddress1.setState("Victoria");
		ofcAddress1.setZipCode("3000");
		
		Address address2 = new Address();
		address2.setStreet("Liverpool");
		address2.setCity("Sydney");
		address2.setState("New South Wales");
		address2.setZipCode("2000");
		
		Address ofcAddress2 = new Address();
		ofcAddress2.setStreet("George");
		ofcAddress2.setCity("Sydney");
		ofcAddress2.setState("New South Wales");
		ofcAddress2.setZipCode("2000");
		
		user.setHomeAddress(address1);
		user.setOfficeAddress(ofcAddress1);
		user2.setHomeAddress(address2);
		user2.setOfficeAddress(ofcAddress2);
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();		
	}
}
