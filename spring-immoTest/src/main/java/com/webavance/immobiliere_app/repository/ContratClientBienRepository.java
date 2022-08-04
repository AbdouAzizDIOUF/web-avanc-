package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.ContratClientBien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ContratClientBienRepository extends JpaRepository<ContratClientBien, Long> {

    @RestResource(path = "/contratType")
    public List<ContratClientBien> findByTypeContaining(@Param("key") String key);


}
