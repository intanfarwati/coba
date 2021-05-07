package com.intan.postman.model.entity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Biodata.TABLE_NAME)
@Data
public class Biodata {
    public static final String TABLE_NAME = "t_biodata";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_bio")
    private Integer id;
    @Column(name = "nama", nullable = false)
    private String nama;
    @Column(name = "alamat")
    private String alamat;}
