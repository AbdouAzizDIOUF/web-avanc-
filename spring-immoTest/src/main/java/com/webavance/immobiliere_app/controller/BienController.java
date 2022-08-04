package com.webavance.immobiliere_app.controller;

import com.webavance.immobiliere_app.entity.Bien;
import com.webavance.immobiliere_app.repository.BienRepository;
import com.webavance.immobiliere_app.repository.BureauRepository;
import com.webavance.immobiliere_app.repository.TerrainRepository;
import com.webavance.immobiliere_app.service.BienService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/conflit/")
public class BienController {

    private final BienService bienService;
    private final BienRepository bienRepository;
    private final BureauRepository bureauRepository;
    private final TerrainRepository terrainRepository;

    public BienController(BienService bienService, BienRepository bienRepository, BureauRepository bureauRepository, TerrainRepository terrainRepository) {
        this.bienService = bienService;
        this.bienRepository = bienRepository;
        this.bureauRepository = bureauRepository;
        this.terrainRepository = terrainRepository;
    }


    /**
     *
     *
     * @return
     */
    @GetMapping("/biens")
    public List<Bien> getAllBiens(){
        return this.bienService.getAllBiens();
    }

    /**
     *
     *
     * @param id
     */
    @GetMapping("/deleBien/{id}")
    public void deleteBiens(@PathVariable Long id){
        this.bienService.deleteBiens(id);
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitB1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoB1(@PathVariable("id") Long id) throws IOException {
    bureauRepository.findById(id).get();
    return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage1()));
    }

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitB2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoB2(@PathVariable("id") Long id) throws IOException {
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage2()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitB3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoB3(@PathVariable("id") Long id) throws IOException {
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage3()));
    }

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitB4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoB4(@PathVariable("id") Long id) throws IOException {
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage4()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitT1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoT1(@PathVariable("id") Long id) throws IOException {
        terrainRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrainRepository.findById(id).get().getImage1()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitT2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoT2(@PathVariable("id") Long id) throws IOException {
        terrainRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrainRepository.findById(id).get().getImage2()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitT3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoT3(@PathVariable("id") Long id) throws IOException {
        terrainRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrainRepository.findById(id).get().getImage3()));
    }

    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduitT4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhotoT4(@PathVariable("id") Long id) throws IOException {
        terrainRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrainRepository.findById(id).get().getImage4()));
    }
}
