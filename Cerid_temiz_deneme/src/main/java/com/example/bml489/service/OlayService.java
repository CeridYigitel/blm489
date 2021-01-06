package com.example.bml489.service;


import com.example.bml489.entity.Olay;
import com.example.bml489.persistence.OlayPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OlayService {

    @Autowired
    OlayPersistence olayPersistence;

    public void createOlay(Olay olay){
        olayPersistence.save(olay);
    }

    public Olay readOlay(int id){
        return olayPersistence.findById(id).get();
    }

    public void updateOlay(Olay olay){
        if(olay.getId() == null){
            return;
        }
        olayPersistence.save(olay);
    }

    public void deleteOlay(int id){
        olayPersistence.deleteById(id);
    }

    public List<Olay> readAll(){
        return (List) olayPersistence.findAll();
    }

}
