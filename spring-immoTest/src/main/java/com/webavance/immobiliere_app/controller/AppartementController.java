package com.webavance.immobiliere_app.controller;

import com.webavance.immobiliere_app.service.AppartementService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin("*")
@RestController
@RequestMapping("/app/")
public class AppartementController {

    private final AppartementService appartementService;

    public AppartementController(AppartementService appartementService) {
        this.appartementService = appartementService;
    }


    /**
     * permet d'afficher l'image
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto1(@PathVariable("id") Long id) throws IOException {

        return this.appartementService.getPhoto1(id);
    }

    /**
     * permet d'afficher l'image
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto2(@PathVariable("id") Long id) throws IOException {

        return this.appartementService.getPhoto2(id);
    }

    /**
     * permet d'afficher l'image
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto3(@PathVariable("id") Long id) throws IOException {

        return this.appartementService.getPhoto3(id);
    }


    /**
     * permet d'afficher l'image
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto4(@PathVariable("id") Long id) throws IOException {

        return this.appartementService.getPhoto4(id);
    }


    /**
     * permet d'upload l'image
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto1(MultipartFile file, @PathVariable Long id) throws IOException {
        this.appartementService.upoadPhoto1(file, id);
    }


    /**
     * permet d'afficher l'image
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto2(MultipartFile file, @PathVariable Long id) throws IOException {
        this.appartementService.upoadPhoto2(file, id);
    }

    /**
     * permet d'afficher l'image
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto3(MultipartFile file, @PathVariable Long id) throws IOException {
        this.appartementService.upoadPhoto3(file, id);
    }

    /**
     * permet d'afficher l'image
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public void upoadPhoto4(MultipartFile file, @PathVariable Long id) throws IOException {
        this.appartementService.upoadPhoto4(file, id);
    }
}
