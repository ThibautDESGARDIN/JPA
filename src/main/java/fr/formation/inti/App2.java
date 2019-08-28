package fr.formation.inti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.inti.Entities.Passager;
import fr.formation.inti.Entities.Voiture;

//import fr.formation.inti.Entities.Department;
//import fr.formation.inti.Entities.Employee;


public class App2 {

	public static void main(String[] args) {
		
		System.out.println("Running App....");
		System.out.println("Create persistence manager");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();
		Passager psgr1 = new Passager();
		Passager psgr2 = new Passager();
		Voiture audi = new Voiture();
		Voiture pgt = new Voiture();
		List<Voiture> listGarrixVoit = new ArrayList<Voiture>();
		listGarrixVoit.add(pgt);
		List<Voiture> listGuettaVoit = new ArrayList<Voiture>();
		listGuettaVoit.add(pgt);
		listGuettaVoit.add(audi);
		
		List<Passager> listAudiPsgr = new ArrayList<Passager>();
		
		listAudiPsgr.add(psgr2);
		
		List<Passager> listPgtPsgr = new ArrayList<Passager>();
		listPgtPsgr.add(psgr1);
		listPgtPsgr.add(psgr2);
		
//		Department bdr = new Department();
//		bdr.setName("Bouche-du-Rhone");
//		Employee emp = new Employee();
//		emp.setFirst_name("Adil");
//		emp.setLast_name("Rami");
//		emp.setStart_date("2017-08-04");  //trop marrant les dates
		
		pgt.setMarque("Peugeot");
		pgt.setPsgr(listPgtPsgr);
		audi.setMarque("Audi");
		audi.setPsgr(listAudiPsgr);
		
		
		psgr1.setNom("Garrix");
		psgr1.setPrenom("Martin");
		
		psgr2.setNom("Guetta");
		psgr2.setPrenom("David");
		
		System.out.println("Persist entities in a transaction");
		EntityTransaction transaction = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		
		transaction.begin();
		
		em.persist(pgt);
		em.persist(audi);
		em.persist(psgr1);
		em.persist(psgr2);
		System.out.println("=====================================================================================");
		System.out.println("Apres persist : " + psgr1);
		System.out.println("=====================================================================================");

		em.remove(psgr1);
		System.out.println("=====================================================================================");
		System.out.println("Apres remove : " + psgr1);
		System.out.println("=====================================================================================");

		transaction.commit();
		
		em.close();
		emf.close();
		
	}

}
