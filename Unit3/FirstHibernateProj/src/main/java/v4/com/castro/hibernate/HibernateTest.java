package com.castro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.castro.dto.UserDetails;
import com.castro.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("First User");	
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		user.setVehicle(vehicle);
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		
	}
}
