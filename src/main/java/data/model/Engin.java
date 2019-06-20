package data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Table
@Entity 
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Engin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 30)
	private String couleur;

	@Column(length = 30)
	private int vitesse_max;
	
	@ManyToOne
	@JoinColumn(name="id_avatar")
	private Avatar avatar;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getVitesse_max() {
		return vitesse_max;
	}

	public void setVitesse_max(int vitesse_max) {
		this.vitesse_max = vitesse_max;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "Engin [id=" + id + ", couleur=" + couleur + ", vitesse_max=" + vitesse_max + ", avatar=" + avatar + "]";
	}

	

}
