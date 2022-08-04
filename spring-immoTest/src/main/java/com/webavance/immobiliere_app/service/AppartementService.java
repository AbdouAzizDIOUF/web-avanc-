package com.webavance.immobiliere_app.service;


import com.webavance.immobiliere_app.entity.Appartement;
import com.webavance.immobiliere_app.repository.AppartementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
@Transactional
public class AppartementService {

    private final AppartementRepository appartementRepository;

    public AppartementService(AppartementRepository appartementRepository) {
        this.appartementRepository = appartementRepository;
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto1(Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage1()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto2(Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage2()));
    }

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto3(Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage3()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto4(Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage4()));
    }


    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto1(MultipartFile file, Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        appartement.setImage1(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage1()), file.getBytes());

        appartementRepository.save(appartement);
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto2(MultipartFile file, Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        appartement.setImage2(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage2()), file.getBytes());

        appartementRepository.save(appartement);
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto3(MultipartFile file, Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        appartement.setImage3(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage3()), file.getBytes());

        appartementRepository.save(appartement);
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto4(MultipartFile file, Long id) throws IOException {
        Appartement appartement = appartementRepository.findById(id).get();
        appartement.setImage4(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/appartement/"+appartement.getImage4()), file.getBytes());

        appartementRepository.save(appartement);
    }
}
