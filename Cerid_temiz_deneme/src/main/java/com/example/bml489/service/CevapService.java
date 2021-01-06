package com.example.bml489.service;

import com.example.bml489.entity.Cevap;
import com.example.bml489.entity.Olay;
import com.example.bml489.persistence.CevapPersistence;
import com.example.bml489.persistence.OlayPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CevapService {
    @Autowired
    CevapPersistence cevapPersistence;

    public void createCevap(Cevap cevap){
        cevapPersistence.save(cevap);
    }

    public Cevap readCevap(int id){
        return cevapPersistence.findById(id).get();
    }

    public void updateCevap(Cevap cevap){
        if(cevap.getId() == null){
            return;
        }
        cevapPersistence.save(cevap);
    }

    public void deleteCevap(int id){
        cevapPersistence.deleteById(id);
    }

    public List<Cevap> readAll(){
        return (List) cevapPersistence.findAll();
    }
}
