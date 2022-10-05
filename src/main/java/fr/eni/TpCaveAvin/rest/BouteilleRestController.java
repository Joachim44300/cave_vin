package fr.eni.TpCaveAvin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.TpCaveAvin.bo.Bouteille;
import fr.eni.TpCaveAvin.service.BouteilleService;

public class BouteilleRestController {

	private BouteilleService bouteilleService;

	@Autowired
	public BouteilleRestController(BouteilleService bouteilleService) {
		this.bouteilleService = bouteilleService;
	}

	@GetMapping("/bouteilles")
	public List<Bouteille> getBouteilles() {
		return bouteilleService.getListBouteille();
	}

}
