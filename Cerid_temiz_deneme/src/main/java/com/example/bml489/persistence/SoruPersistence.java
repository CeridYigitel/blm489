package com.example.bml489.persistence;

import com.example.bml489.entity.Soru;
import org.springframework.data.repository.CrudRepository;

public interface SoruPersistence extends CrudRepository<Soru,Integer> {
}