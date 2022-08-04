package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface EntrepriseRepository extends JpaRepository<Entreprise, String> {
}
