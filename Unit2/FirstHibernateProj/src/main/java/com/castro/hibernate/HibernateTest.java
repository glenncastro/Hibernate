package com.castro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.castro.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(3);
		user.setUserName("Third User");

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
