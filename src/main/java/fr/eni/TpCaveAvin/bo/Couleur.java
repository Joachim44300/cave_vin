package fr.eni.TpCaveAvin.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Couleur {

	@Id
	@GeneratedValue
	private int id;
	private String nom;

	public Couleur(String nom) {
		super();
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Couleur [id=" + id + ", nom=" + nom + "]";
	}

}
