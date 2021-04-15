package fr.kmerjob.daoJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoJpa {
	protected static EntityManagerFactory emf; //Singleton
	protected EntityManager em;
	
	public DaoJpa() {
		if (emf == null) { //Singleton
			emf = Persistence.createEntityManagerFactory("KMerjobUnit");
		}
		
		em = emf.createEntityManager();
	}
	
}