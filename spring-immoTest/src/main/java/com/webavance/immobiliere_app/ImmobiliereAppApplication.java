package com.webavance.immobiliere_app;

import com.webavance.immobiliere_app.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ImmobiliereAppApplication implements CommandLineRunner {

    final
    RepositoryRestConfiguration repositoryRestConfiguration;

    public ImmobiliereAppApplication(RepositoryRestConfiguration repositoryRestConfiguration) {
         this.repositoryRestConfiguration = repositoryRestConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(ImmobiliereAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(
                Bien.class,
                Appartement.class,
                Villa.class,
                Bureau.class,
                Terrain.class,
                Studio.class,
                ContratClientBien.class,
                Particulier.class,
                Entreprise.class,
                Projet.class,
                Paiement.class
                ); // expose le $id
    }
}
