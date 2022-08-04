package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Appartement;
import com.webavance.immobiliere_app.entity.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("immo-agence.fr")
@RepositoryRestResource
public interface AppartementRepository extends JpaRepository<Appartement, Long> {

    @RestResource(path="/appartementContrat")
    public List<Appartement> findByAvaibleIsFalse();

    @RestResource(path="/appartementDispo")
    public List<Appartement> findByAvaibleIsTrue();

    @RestResource(path="/trouveAppartement")
    public List<Appartement> findByAdresseContainsOrStatusContainsOrPriceAndAvaibleIsTrue(
            String adresse, String status, Double price
    );

    @RestResource(path="/trouveAppartement2")
    public List<Appartement> findByStatusOrAdresseOrPriceAndAvaibleIsTrue(
            String status, String adresse, Double price);


    @RestResource(path="/trouveAppartementStatus")
    public List<Appartement> findByStatusContains(@Param("status") String status);

    @RestResource(path="/trouveAppartementAdresse")
    public List<Appartement> findByAdresseContains(@Param("adresse") String adresse);

    @RestResource(path="/trouveAppartementPrice")
    public List<Appartement> findByPriceContains(Double price);
}
