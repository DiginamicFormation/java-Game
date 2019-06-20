package data.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Partie {
	@Id
	@Column(name = "id_partie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany(mappedBy="parties")
	private List<Joueur> joueurs;
	
	@Column(length = 30)
	private int niveau;
	
	@Column(length = 30)
	private int score;
	
	@Column
	private LocalDate date_;
	
	public Partie(){}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getDate_() {
		return date_;
	}

	public void setDate_(LocalDate date_) {
		this.date_ = date_;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	@Override
	public String toString() {
		return "Partie [id=" + id + ", joueurs=" + joueurs + ", niveau=" + niveau + ", score=" + score + ", date_="
				+ date_ + "]";
	}
	
}
