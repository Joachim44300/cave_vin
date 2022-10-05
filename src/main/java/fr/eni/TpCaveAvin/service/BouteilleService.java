package fr.eni.TpCaveAvin.service;

import java.util.List;

import fr.eni.TpCaveAvin.bo.Bouteille;
import fr.eni.TpCaveAvin.bo.Couleur;
import fr.eni.TpCaveAvin.bo.Region;

public interface BouteilleService {

	public List<Bouteille> getListBouteille();

	public Bouteille getBouteilleById(int id);

	public List<Couleur> getListCouleur();

	public Couleur getCouleurById(int id);

	public List<Region> getListRegion();

	public Region getRegionById(int id);

	void saveBouteille(Bouteille bouteille);

}
