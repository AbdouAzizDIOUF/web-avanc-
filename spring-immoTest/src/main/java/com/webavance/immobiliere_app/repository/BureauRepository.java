package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Appartement;
import com.webavance.immobiliere_app.entity.Bureau;
import com.webavance.immobiliere_app.entity.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface BureauRepository extends JpaRepository<Bureau, Long> {


    @RestResource(path="/bureauContrat")
    public List<Bureau> findByAvaibleIsFalse();

    @RestResource(path="/bureauDispo")
    public List<Bureau> findByAvaibleIsTrue();

    @RestResource(path="/trouveBureau")
    public List<Bureau> findByAdresseOrStatusOrPriceAndAvaibleIsTrue(
            @Param("adresse") String adresse,
            @Param("status") String status,
            @Param("price") Double price
    );
}
