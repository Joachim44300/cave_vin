package fr.eni.TpCaveAvin.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.TpCaveAvin.bo.Bouteille;

public interface BouteilleRepository extends JpaRepository<Bouteille, Integer> {

}
