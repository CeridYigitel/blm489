package com.example.bml489.service;

import com.example.bml489.entity.Cevap;
import com.example.bml489.entity.User;
import com.example.bml489.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserPersistence userPersistence;
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public void createUser(User user){
        User u = new User();
        u.setAdSoyad(user.getAdSoyad());
        u.setUsername(user.getUsername());
        u.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userPersistence.save(u);
    }

    /*public Cevap readCevap(int id){
        return userPersistence.findById(id).get();
    }

    public void updateCevap(Cevap cevap){
        if(cevap.getId() == null){
            return;
        }
        userPersistence.save(cevap);
    }

    public void deleteCevap(int id){
        userPersistence.deleteById(id);
    }

    public List<Cevap> readAll(){
        return (List) userPersistence.findAll();
    }*/
}
