package appli;

import java.util.List;

import javax.persistence.EntityManager;

import data.DatabaseHandle;
import data.model.Joueur;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		long nbJoueur = (Long) em.createQuery("Select count(j) from Joueur j").getSingleResult();
		System.out.println(nbJoueur);
		
		
		@SuppressWarnings("unchecked")
		List<Joueur> lJoueur = em.createQuery("Select j from Joueur j order by j.nom asc").getResultList();
		for (Joueur j : lJoueur)
		{
			System.out.println(j.toString());
		}
		
		em.close();
		System.exit(0);
	}

}
