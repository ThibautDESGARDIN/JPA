//package fr.formation.inti;
//
//import javax.persistence.Entity;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import fr.formation.inti.Entities.Department;
//
//public class App {
//	public static void main(String[] args) {
//		System.out.println("Running App....");
//		
//		System.out.println("Create persistence manager");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");
//		EntityManager em = emf.createEntityManager();
//		
//		System.out.println("Create Entities : departement");
//		
//		Department bdr = new Department();
//		bdr.setName("Bouches du Rhone");
//		Department nord = new Department();
//		nord.setName("Nord");
//		
//		
//		System.out.println("Persist entities in a transaction");
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
//		em.persist(bdr);
//		em.persist(nord);
//		transaction.commit();
//		
//		
//		
//		
//		
//	}
//}
