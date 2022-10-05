package fr.eni.TpCaveAvin.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.TpCaveAvin.bo.Couleur;

public interface CouleurRepository extends JpaRepository<Couleur, Integer> {

}
