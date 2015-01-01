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
		
		user.getListOfAddresses().add(address1);
		user.getListOfAddresses().add(address2);
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		session = factory.openSession();
		user = (UserDetails) session.get(UserDetails.class, 1);
		
		// if fetch is EAGER, no error
		// if LAZY (default), exception in initializing proxy
		session.close();
		System.out.println(user.getListOfAddresses().size());
	}

}
