package apslivraria.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import apslivraria.model.Livro;


public class Connection {
	public static SessionFactory getCurrentSessionFromJPA() {
		  EntityManagerFactory emf = 
		      Persistence.createEntityManagerFactory("Livraria");
		  EntityManager entityManager = emf.createEntityManager();

		  Session session = entityManager.unwrap(org.hibernate.Session.class);
		  SessionFactory factory = session.getSessionFactory();
		  return factory;
		}
	public static void addLivro(Livro livro) {
		EntityManagerFactory factory = 
			      Persistence.createEntityManagerFactory("Livraria");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
		manager.close();
	}
	
//	public static v
}	

