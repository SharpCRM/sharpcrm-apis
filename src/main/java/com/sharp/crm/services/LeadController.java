package com.sharp.crm.services;

import java.util.ArrayList;
import java.util.List;

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

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class LeadController {
    
    @Autowired
    LeadsRepository repo;
    
    @PostMapping("/addLead")
    public ResponseEntity<Lead> createTutorial(@RequestBody Lead lead) {
      try {
        Lead leads = repo.save(lead);
        return new ResponseEntity<Lead>(leads, HttpStatus.CREATED);
      } catch (Exception e) {
        return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
    
    public ResponseEntity<List<Lead>> getAllLeads(){
        List<Lead> leadsList=new ArrayList<Lead>();
        
      repo.findAll().forEach(leadsList::add);
      
      if(leadsList.isEmpty()) {
          return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
      }
    return new ResponseEntity<>(leadsList,HttpStatus.OK);
    }
}
