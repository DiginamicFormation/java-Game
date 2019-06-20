package appli;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import data.DatabaseHandle;
import data.model.Joueur;
import data.model.Partie;

public class Main {

	public static void main(String[] args) {

		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();

		long nbJoueur = (Long) em.createQuery("Select count(j) from Joueur j").getSingleResult();
		System.out.println(nbJoueur);

		@SuppressWarnings("unchecked")
		List<Joueur> lJoueur = em.createQuery("Select j from Joueur j order by j.nom asc").getResultList();
		for (Joueur j : lJoueur) {
			System.out.println(j.toString());
		}

		Partie p1 = new Partie();
		p1.setNiveau(2);
		p1.setScore(1500);
		p1.setDate_(LocalDate.now());
		em.persist(p1);

		Partie p3 = new Partie();
		p3.setNiveau(5);
		p3.setScore(13435);
		p3.setDate_(LocalDate.of(2018, 03, 02));
		em.persist(p3);

		TypedQuery<Partie> typedQuery = em.createQuery("from Partie", Partie.class);

		try {
			typedQuery.getResultList().forEach(e -> e.setNiveau(e.getNiveau() + 1));

		} catch (Exception e) {
			System.out.println("Erreur");
		}
		
		@SuppressWarnings("unchecked")
		List<Partie> lPartie = em.createQuery("Select p from Partie p order by p.date_ desc").getResultList();
		for (Partie p : lPartie) {
			System.out.println(p.toString());
		}

		transaction.commit();
		
		em.close();
		System.exit(0);
	}

}
