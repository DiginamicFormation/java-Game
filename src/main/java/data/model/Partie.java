package data.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Partie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
		
	

	@Column(length = 30)
	private int niveau;
	
	@Column(length = 30)
	private int score;
	
	@Column
	private LocalDate date_;
	
	
	
	public Partie() {
		super();
	}

	
	
	
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




	@Override
	public String toString() {
		return "Partie [id=" + id + ", niveau=" + niveau + ", score=" + score + ", date_=" + date_ + "]";
	}

	
	
}
