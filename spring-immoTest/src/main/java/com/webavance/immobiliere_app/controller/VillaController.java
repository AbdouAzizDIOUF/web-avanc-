package com.webavance.immobiliere_app.controller;


import com.webavance.immobiliere_app.service.VillaService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin("*")
@RestController
@RequestMapping("/vil/")
public class VillaController {

    private final VillaService villaService;

    public VillaController(VillaService villaService) {
        this.villaService = villaService;
    }

    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit1/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto1(@PathVariable("id") Long id) throws IOException {

        return this.villaService.getPhoto1(id);
    }


    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit2/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto2(@PathVariable("id") Long id) throws IOException {

        return this.villaService.getPhoto2(id);
    }

    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit3/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto3(@PathVariable("id") Long id) throws IOException {

        return this.villaService.getPhoto3(id);
    }

    /***
     * Permet d'optenir l'aimage d'un villa
     *
     * @param id
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/photoProduit4/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getPhoto4(@PathVariable("id") Long id) throws IOException {

        return this.villaService.getPhoto4(id);
    }


    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto1/{id}")
    public void upoadPhoto1(MultipartFile file, @PathVariable Long id) throws IOException {
        this.villaService.upoadPhoto1(file, id);
    }

    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto2/{id}")
    public void upoadPhoto2(MultipartFile file, @PathVariable Long id) throws IOException {
        this.villaService.upoadPhoto2(file, id);
    }

    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto3/{id}")
    public void upoadPhoto3(MultipartFile file, @PathVariable Long id) throws IOException {
        this.villaService.upoadPhoto3(file, id);
    }

    /**
     * Permet d'optenir l'aimage d'un villa
     *
     * @param file
     * @param id
     * @throws IOException
     */
    @PostMapping(path="/uploadPhoto4/{id}")
    public void upoadPhoto4(MultipartFile file, @PathVariable Long id) throws IOException {
        this.villaService.upoadPhoto4(file, id);
    }
}
