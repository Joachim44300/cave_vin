package fr.eni.TpCaveAvin.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bouteille {

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private boolean isPetillant;
	private String millesime;
	private int quantite;
	@ManyToOne
	private Couleur couleur;
	@ManyToOne
	private Region region;

	public Bouteille(String nom, boolean isPetillant, String millesime, int quantite, Couleur couleur, Region region) {
		super();
		this.nom = nom;
		this.isPetillant = isPetillant;
		this.millesime = millesime;
		this.quantite = quantite;
		this.couleur = couleur;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isPetillant() {
		return isPetillant;
	}

	public void setPetillant(boolean isPetillant) {
		this.isPetillant = isPetillant;
	}

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Bouteille [id=" + id + ", nom=" + nom + ", isPetillant=" + isPetillant + ", millesime=" + millesime
				+ ", quantite=" + quantite + ", couleur=" + couleur + ", region=" + region + "]";
	}

}
