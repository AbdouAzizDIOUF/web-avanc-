package com.webavance.immobiliere_app.repository;

import com.webavance.immobiliere_app.entity.Bien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//#@CrossOrigin("http://178.128.154.67:4222/")
@CrossOrigin("*")
@RepositoryRestResource
public interface BienRepository extends JpaRepository<Bien, Long> {
}
