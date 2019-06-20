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
import repository.JoueurRepository;

public class Main {

	public static void main(String[] args) {

		JoueurRepository.getJoueurByName("DOE");
		JoueurRepository.getPseudoPlayerSorted();
		JoueurRepository.getPlayerPlayedToday(LocalDate.of(2018, 10, 20));
		JoueurRepository.getPlayerEngins("DOE");
		
		System.exit(0);
	}

}
