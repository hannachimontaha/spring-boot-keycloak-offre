package com.iset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;

@SpringBootApplication
public class SpringBootKeycloakOffreApplication  implements CommandLineRunner{
	@Autowired 
	OffreRepository offreRepository; 

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKeycloakOffreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		offreRepository.save(new Offre(1,"Web Design", "informatique","AXA", 2, "France"));
		 offreRepository.save(new Offre(2,"Developpeur", "informatique","Talys", 3, "Tunisie")); 
	     offreRepository.save(new Offre(3,"Architecte", "informatique","SIS", 2, "Allemagne")); 
		
	}

}
