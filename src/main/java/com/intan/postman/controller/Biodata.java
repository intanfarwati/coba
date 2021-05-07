package com.intan.postman.controller;

import com.intan.postman.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biodata")
public class Biodata {

    @PostMapping()
    public BiodataDto getSomething(@RequestBody BiodataDto biodataDto) {
        BiodataDto b = new BiodataDto();
        b.setNama(biodataDto.getNama());
        b.setAlamat(biodataDto.getAlamat());
        return b;
    }

    @GetMapping()
    public BiodataDto getThis() {
        BiodataDto b = new BiodataDto();
        b.setNama("siapa ya");
        b.setAlamat("dimana ya");
        return b;
    }

}
