package repository;

import java.time.LocalDate;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import data.DatabaseHandle;
import data.model.Joueur;


public class JoueurRepository {

	static EntityManager em = DatabaseHandle.getEntityManagerFactory();
	static EntityTransaction transaction = em.getTransaction();

	public static void getJoueurByName(String name) {
		TypedQuery<Joueur> q = em.createQuery("select j from Joueur j where j.nom = :name", Joueur.class);
		q.setParameter("name", name);
		Joueur p = q.getSingleResult();
		System.out.println(p.toString()); 
	}
	public static void getPseudoPlayerSorted() {
		TypedQuery<Joueur> q = em.createQuery("from Joueur", Joueur.class);
		q.getResultList().stream().sorted((e1, e2) -> e1.getPseudo().compareTo(e2.getPseudo())).forEach(e->System.out.println(e.getPseudo()));
	}
	public static void getPlayerPlayedToday(LocalDate date) {
		System.out.print("Joueurs en date du "+ date);
		TypedQuery<Joueur> q = em.createQuery("Select j FROM Joueur j Join j.parties p Join p.joueurs Where p.date_=: date_partie ", Joueur.class);
		q.setParameter("date_partie", date);
		
		q.getResultList().stream().forEach(e->System.out.println(e.getPseudo()));
		System.out.println("--------------------------------------------");
	}
	public static void getPlayerEngins(String pseudo) {
		//TypedQuery<Joueur> q = em.createQuery("Select j FROM Joueur j Where j.pseudo = :pseudo",Joueur.class);
		TypedQuery<Joueur> q = em.createQuery("Select j FROM Joueur j Join j.avatar a Join a.engins Where j.pseudo = :pseudo", Joueur.class);
		q.setParameter("pseudo", pseudo);
		q.setMaxResults(1);
		System.out.println(q.getResultList());
		
	}
	
}
