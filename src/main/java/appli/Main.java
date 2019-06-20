package appli;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import data.DatabaseHandle;
import data.model.Avatar;
import data.model.Engin;
import data.model.Joueur;
import data.model.Partie;

public class Main {

	public static void main(String[] args) {

		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		@SuppressWarnings("unchecked")
		List<Partie> lPartie = em.createQuery("Select p from Partie p order by p.date_ desc").getResultList();
		for (Partie p : lPartie) {
			System.out.println(p.toString());
		}
		
		em.close();
		System.exit(0);
	}

}
