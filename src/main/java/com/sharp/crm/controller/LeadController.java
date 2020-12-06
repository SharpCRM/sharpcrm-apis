package com.sharp.crm.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Lead;
import com.sharp.crm.repo.LeadsRepository;


//@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api")
public class LeadController {
   
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
	LeadsRepository leadRepository;
	
    
  
    @PostMapping(value= "/lead/save")
    public Lead save(final @RequestBody Lead lead) {
    	log.info("Saving lead details in the database.");
		return leadRepository.save(lead);
    	
		 
    	
    }
      
    
  
}
