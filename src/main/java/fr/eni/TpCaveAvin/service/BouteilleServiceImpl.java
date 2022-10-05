package fr.eni.TpCaveAvin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.TpCaveAvin.bo.Bouteille;
import fr.eni.TpCaveAvin.bo.Couleur;
import fr.eni.TpCaveAvin.bo.Region;
import fr.eni.TpCaveAvin.dal.BouteilleRepository;
import fr.eni.TpCaveAvin.dal.CouleurRepository;
import fr.eni.TpCaveAvin.dal.RegionRepository;

@Service
public class BouteilleServiceImpl implements BouteilleService {

	private BouteilleRepository bouteilleRepository;
	private CouleurRepository couleurRepository;
	private RegionRepository regionRepository;

	@Autowired
	public BouteilleServiceImpl(BouteilleRepository bouteilleRepository, CouleurRepository couleurRepository,
			RegionRepository regionRepository) {
		this.bouteilleRepository = bouteilleRepository;
		this.couleurRepository = couleurRepository;
		this.regionRepository = regionRepository;
	}

	@Override
	public List<Bouteille> getListBouteille() {
		// TODO Auto-generated method stub
		return bouteilleRepository.findAll();
	}

	@Override
	public Bouteille getBouteilleById(int id) {
		// TODO Auto-generated method stub
		return bouteilleRepository.findById(id).get();
	}

	@Override
	public List<Couleur> getListCouleur() {
		// TODO Auto-generated method stub
		return couleurRepository.findAll();
	}

	@Override
	public Couleur getCouleurById(int id) {
		// TODO Auto-generated method stub
		return couleurRepository.findById(id).get();
	}

	@Override
	public List<Region> getListRegion() {
		// TODO Auto-generated method stub
		return regionRepository.findAll();
	}

	@Override
	public Region getRegionById(int id) {
		// TODO Auto-generated method stub
		return regionRepository.findById(id).get();
	}

	@Override
	public void saveBouteille(Bouteille bouteille) {
		// TODO Auto-generated method stub
		bouteilleRepository.save(bouteille);
	}

}
