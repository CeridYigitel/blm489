package com.example.bml489;

import com.example.bml489.entity.*;
import com.example.bml489.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Bml489Application implements CommandLineRunner {

	@Autowired
	private UserPersistence userPersistence;
	@Autowired
	private SoruPersistence soruPersistence;
	@Autowired
	private OlayPersistence olayPersistence;
	@Autowired
	private CevapPersistence cevapPersistence;


	public static void main(String[] args) {
		SpringApplication.run(Bml489Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		User find = userPersistence.findByUsername("cerid_yigitel");
		try {
			if (find == null) {
				User o = new User();
				o.setAdSoyad("Cerid İsmail Yiğitel");
				o.setUsername("cerid_yigitel");
				o.setPassword(bCryptPasswordEncoder.encode("cerit"));
				userPersistence.save(o);
			}

		}catch (Exception e){

		}

		/*Olay find_olay= olayPersistence.findByBaslik("Pharsalus Muharebesi");
		try{
			if(find_olay==null){
				Olay ol =new Olay();
				ol.setBaslik("Pharsalus Muharebesi");
				olayPersistence.save(ol);
			}
		}catch (Exception e){

		}*/
	}
}
