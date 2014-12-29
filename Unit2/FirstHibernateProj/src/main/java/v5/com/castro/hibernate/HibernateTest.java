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
		
		Address address2 = new Address();
		address2.setStreet("Liverpool");
		address2.setCity("Sydney");
		address2.setState("New South Wales");
		address2.setZipCode("2000");
		
		user.setAddress(address1);
		user2.setAddress(address2);
		
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
