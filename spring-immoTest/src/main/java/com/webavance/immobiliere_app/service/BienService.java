package com.webavance.immobiliere_app.service;


import com.webavance.immobiliere_app.entity.Bien;
import com.webavance.immobiliere_app.repository.BienRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BienService {

    private final BienRepository bienRepository;

    public BienService(BienRepository bienRepository) {
        this.bienRepository = bienRepository;
    }

    public List<Bien> getAllBiens(){
        return this.bienRepository.findAll();
    }

    public void deleteBiens(Long id){
        bienRepository.delete(bienRepository.findById(id).get());
    }
}
