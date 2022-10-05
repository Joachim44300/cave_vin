package fr.eni.TpCaveAvin.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.TpCaveAvin.bo.Region;

public interface RegionRepository extends JpaRepository<Region, Integer> {

}
