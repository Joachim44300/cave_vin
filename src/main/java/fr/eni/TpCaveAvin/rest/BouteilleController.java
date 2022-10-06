package fr.eni.TpCaveAvin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.TpCaveAvin.service.BouteilleService;

@Controller
public class BouteilleController {

	private BouteilleService bouteilleService;

	@Autowired
	private BouteilleController(BouteilleService bouteilleService) {
		this.bouteilleService = bouteilleService;

	}

	@RequestMapping({ "/", "", "/index" })
	public String index() {

		return "index";
	}

	@RequestMapping({ "/bouteilles" })
	public String getListBouteilles() {

		return "bouteilles";
	}

}
