package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.Resource;
@CrossOrigin("*")
@RepositoryRestResource
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
