package com.webavance.immobiliere_app.controller;


import com.webavance.immobiliere_app.entity.Appartement;
import com.webavance.immobiliere_app.entity.Bureau;
import com.webavance.immobiliere_app.repository.BureauRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/bur/")
public class BureauController {

    private final BureauRepository bureauRepository;

    public BureauController(BureauRepository bureauRepository) {
        this.bureauRepository = bureauRepository;
    }

    /**
     *
     *
     * @return
     */
    @GetMapping("/allBureau")
    public List<Bureau> getAllBureaux(){
        return bureauRepository.findAll();
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
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage1()));
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
    @GetMapping(path = "/photoProduit3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto3(@PathVariable("id") Long id) throws IOException {
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage3()));
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
        bureauRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureauRepository.findById(id).get().getImage4()));
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
        Bureau bureau = bureauRepository.findById(id).get();
        bureau.setImage1(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureau.getImage1()), file.getBytes());

        bureauRepository.save(bureau);
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
        Bureau bureau = bureauRepository.findById(id).get();
        bureau.setImage2(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureau.getImage2()), file.getBytes());

        bureauRepository.save(bureau);
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
        Bureau bureau = bureauRepository.findById(id).get();
        bureau.setImage3(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureau.getImage3()), file.getBytes());

        bureauRepository.save(bureau);
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
        Bureau bureau = bureauRepository.findById(id).get();
        bureau.setImage4(file.getOriginalFilename());
        Files.write(Paths.get(System.getProperty("user.home")+"/immo-agence/bureau/"+bureau.getImage4()), file.getBytes());

        bureauRepository.save(bureau);
    }

    /**
     *
     *
     * @param bureau
     * @return
     */
    @PostMapping("/cree")
    public Bureau createB(@RequestBody Bureau bureau){
        return this.bureauRepository.save(bureau);
    }
}
