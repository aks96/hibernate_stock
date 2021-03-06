package com.usecase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    								.configure()
    								.build();
    	
    	SessionFactory factory = new MetadataSources(registry)
    			.buildMetadata()
    			.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	session.close();
    	factory.close(); 
    }
}
