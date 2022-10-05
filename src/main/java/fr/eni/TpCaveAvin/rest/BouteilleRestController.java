package fr.eni.TpCaveAvin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.TpCaveAvin.bo.Bouteille;
import fr.eni.TpCaveAvin.service.BouteilleService;

@RestController
@RequestMapping("/rest")
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

	@GetMapping("/bouteilles/{id}")
	public Bouteille getCrayon(@PathVariable("id") int id) {
		Bouteille bouteille = bouteilleService.getBouteilleById(id);
		System.out.println("getBouteille : " + bouteille);
		return bouteille;
	}

	@PostMapping("/bouteilles")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Bouteille ajouterBouteille(@RequestBody Bouteille bouteille) {
		bouteilleService.ajouterBouteille(bouteille);

		return bouteille;
	}

	@PutMapping("/crayons")
	public Bouteille modifierBouteille(@RequestBody Bouteille bouteille) {
		bouteilleService.modifierBouteille(bouteille);

		return bouteille;
	}

	@DeleteMapping("/bouteilles/{id}")
	public void supprimerBouteille(@PathVariable("id") Integer id) {
		bouteilleService.supprimerBouteille(id);

	}

}
