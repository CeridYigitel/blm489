package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Soru {
    @Id
    @GeneratedValue
    private Integer id ;

    private String soruCumlesi;
    private String soruTipi;
    private String secenekler;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Cevap> cevaplar;
}
