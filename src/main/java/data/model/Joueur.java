package data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom", length = 30)
	private String nom;
	
	@Column(name = "mail", length = 30)
	private String mail;
	
	@Column(name = "pseudo", length = 30)
	private String pseudo;
	
	
	public Joueur() {
	}


	protected Integer getId() {
		return id;
	}


	protected void setId(Integer id) {
		this.id = id;
	}


	protected String getNom() {
		return nom;
	}


	protected void setNom(String nom) {
		this.nom = nom;
	}


	protected String getMail() {
		return mail;
	}


	protected void setMail(String mail) {
		this.mail = mail;
	}


	protected String getPseudo() {
		return pseudo;
	}


	protected void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", mail=" + mail + ", pseudo=" + pseudo + "]";
	}
	
	
}
