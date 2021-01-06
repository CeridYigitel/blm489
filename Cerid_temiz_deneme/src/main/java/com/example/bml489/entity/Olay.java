package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Olay {
    @Id
    @GeneratedValue
    private Integer id;

    private String baslik;
    private String detay;
    private String tarih;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Soru> sorular;
}
