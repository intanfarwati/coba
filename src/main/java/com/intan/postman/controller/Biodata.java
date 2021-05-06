package com.intan.postman.controller;

import com.intan.postman.model.BiodataDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biodata")
public class Biodata {

    @GetMapping()
    public BiodataDto getSomething(@RequestBody BiodataDto biodataDto) {
        BiodataDto b = new BiodataDto();
        b.setNama(biodataDto.getNama());
        b.setAlamat(biodataDto.getAlamat());
        return b;
    }

}
