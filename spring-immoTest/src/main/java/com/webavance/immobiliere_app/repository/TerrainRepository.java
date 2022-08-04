package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Appartement;
import com.webavance.immobiliere_app.entity.Terrain;
import com.webavance.immobiliere_app.entity.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface TerrainRepository extends JpaRepository<Terrain, Long> {

    @RestResource(path="/terrainContrat")
    public List<Terrain> findByAvaibleIsFalse();

    @RestResource(path="/terrainDispo")
    public List<Terrain> findByAvaibleIsTrue();

    @RestResource(path="/trouveTerrain")
    public List<Terrain> findByAdresseOrStatusOrPriceAndAvaibleIsTrue(
            @Param("adresse") String adresse,
            @Param("status") String status,
            @Param("price") Double price
    );
}
