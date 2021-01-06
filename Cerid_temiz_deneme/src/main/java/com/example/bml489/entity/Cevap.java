package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Cevap {
    @Id
    @GeneratedValue
    private Integer id;

    //private String soruTipi;
    private String soruNu;
    private String cevapMetni;
    private String kullaniciAdi;
    private String hakliTaraf;
    private String onemPuani;
}
