package com.webavance.immobiliere_app.controller;


import com.webavance.immobiliere_app.entity.Terrain;
import com.webavance.immobiliere_app.entity.Terrain;
import com.webavance.immobiliere_app.repository.TerrainRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/ter/")
public class TerrainController {

    private final TerrainRepository terrainRepository;

    public TerrainController(TerrainRepository terrainRepository) {
        this.terrainRepository = terrainRepository;
    }

    /**
     *
     *
     * @return
     */
    @GetMapping("/allTerrain")
    public List<Terrain> getAllTerrains(){
        return terrainRepository.findAll();
    }


    /**
     *
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto1(@PathVariable("id") Long id) throws IOException {
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
    @GetMapping(path = "/photoProduit2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto2(@PathVariable("id") Long id) throws IOException {
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
    @GetMapping(path = "/photoProduit3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto3(@PathVariable("id") Long id) throws IOException {
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
    @GetMapping(path = "/photoProduit4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto4(@PathVariable("id") Long id) throws IOException {
        terrainRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrainRepository.findById(id).get().getImage4()));
    }


    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto1(MultipartFile file, @PathVariable Long id) throws IOException {
        Terrain terrain = terrainRepository.findById(id).get();
        terrain.setImage1(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrain.getImage1()), file.getBytes());

        terrainRepository.save(terrain);
    }

    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto2(MultipartFile file, @PathVariable Long id) throws IOException {
        Terrain terrain = terrainRepository.findById(id).get();
        terrain.setImage2(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrain.getImage2()), file.getBytes());

        terrainRepository.save(terrain);
    }


    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto3(MultipartFile file, @PathVariable Long id) throws IOException {
        Terrain terrain = terrainRepository.findById(id).get();
        terrain.setImage3(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrain.getImage3()), file.getBytes());

        terrainRepository.save(terrain);
    }


    /**
     *
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto4(MultipartFile file, @PathVariable Long id) throws IOException {
        Terrain terrain = terrainRepository.findById(id).get();
        terrain.setImage4(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/terrain/"+terrain.getImage4()), file.getBytes());

        terrainRepository.save(terrain);
    }
}
