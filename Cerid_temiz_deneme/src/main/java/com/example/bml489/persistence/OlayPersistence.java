package com.example.bml489.persistence;

import com.example.bml489.entity.Olay;
import com.example.bml489.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface OlayPersistence extends CrudRepository<Olay,Integer> {
    public Olay findByBaslik(String baslik);
}
