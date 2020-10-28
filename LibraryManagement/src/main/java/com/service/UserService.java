package com.service;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.model.*;

public class UserService {
	public static SessionFactory factory;
	
	public static SessionFactory getSessionFactory(){
		
		 Configuration configuration=new Configuration().configure("hibernate.cfg.xml");   
	     StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
	      serviceRegistryBuilder.applySettings(configuration.getProperties());
	      ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
	      factory  =  configuration.addAnnotatedClass(UserLibrary.class).buildSessionFactory(serviceRegistry);
	      return factory;
	}
	public static void closeFactory(){
		factory.close();
		
	}

}
