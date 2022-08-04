package com.webavance.immobiliere_app.service;

import com.webavance.immobiliere_app.entity.Villa;
import com.webavance.immobiliere_app.repository.AppartementRepository;
import com.webavance.immobiliere_app.repository.VillaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@Service
@Transactional
public class VillaService {

    private final VillaRepository villaRepository;

    public VillaService(VillaRepository villaRepository) {
        this.villaRepository = villaRepository;
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto1(Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage1()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto2(Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage2()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto3(Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage3()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    public  byte[] getPhoto4(Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage4()));
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto1(MultipartFile file, Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        villa.setImage1(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage1()), file.getBytes());

        villaRepository.save(villa);
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto2(MultipartFile file, Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        villa.setImage2(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage2()), file.getBytes());

        villaRepository.save(villa);
    }


    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto3(MultipartFile file, Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        villa.setImage3(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage3()), file.getBytes());

        villaRepository.save(villa);
    }


    /**
     *
     * @param file
     * @param id
     * @throws IOException
     */
    public void upoadPhoto4(MultipartFile file, Long id) throws IOException {
        Villa villa = villaRepository.findById(id).get();
        villa.setImage4(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/villa/"+villa.getImage4()), file.getBytes());

        villaRepository.save(villa);
    }
}
