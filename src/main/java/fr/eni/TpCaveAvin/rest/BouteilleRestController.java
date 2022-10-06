package fr.eni.TpCaveAvin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Bouteille getBouteille(@PathVariable("id") int id) {
		Bouteille bouteille = bouteilleService.getBouteilleById(id);
		System.out.println("getBouteille : " + bouteille);
		return bouteille;
	}

	@PostMapping("/bouteilles")
	public ResponseEntity<?> ajouterBouteille(@RequestBody Bouteille bouteille) {
		String message_erreur = bouteilleService.getError(bouteille);
		if (message_erreur.length() > 0) {
			return new ResponseEntity<>(message_erreur, HttpStatus.BAD_REQUEST);
		} else {
			bouteilleService.ajouterBouteille(bouteille);
			return new ResponseEntity<Bouteille>(bouteille, HttpStatus.CREATED);
		}

	}

	@PutMapping("/bouteilles")
	public ResponseEntity<?> modifierBouteille(@RequestBody Bouteille bouteille) {
		String message_erreur = bouteilleService.getError(bouteille);
		if (message_erreur.length() > 0) {
			return new ResponseEntity<>(message_erreur, HttpStatus.BAD_REQUEST);
		} else {
			bouteilleService.modifierBouteille(bouteille);
			return new ResponseEntity<Bouteille>(bouteille, HttpStatus.CREATED);
		}
	}

	@DeleteMapping("/bouteilles/{id}")
	public void supprimerBouteille(@PathVariable("id") Integer id) {
		bouteilleService.supprimerBouteille(id);

	}

}
