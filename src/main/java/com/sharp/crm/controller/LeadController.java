package com.sharp.crm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> Stashed changes
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Lead;
<<<<<<< Updated upstream
import com.sharp.crm.services.LeadService;

//@CrossOrigin(origins = "http://localhost:3000")
=======
import com.sharp.crm.repo.LeadsRepository;


//@CrossOrigin(origins = "http://localhost:3000")

>>>>>>> Stashed changes
@RestController
@RequestMapping("/api")
public class LeadController {
   
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
<<<<<<< Updated upstream
    LeadService leadService;
    
      
    @PostMapping("/addLead") 
    public Lead save(@RequestBody Lead lead) {
        log.info("Saving lead details in the database.");
        return leadService.saveLead(lead);
        
    }
    @GetMapping("/lead") 
    public List<Lead> getAllLeads(){
        return leadService.getAllLeads();
    }
    
    @GetMapping("/lead/{id}") 
    public Lead getLead(@PathVariable int id){
        return leadService.getLeadById(id);
    }
    
    @PutMapping("/update")
    public Lead updateLead(@RequestBody Lead lead) {
        return leadService.updateLead(lead);
    }
    
    @DeleteMapping("/lead/{id}")
    public String deleteProduct(@PathVariable int id) {
        return leadService.deleteLead(id);
    }
=======
	LeadsRepository leadRepository;
	
    
  
    @PostMapping(value= "/lead/save")
    public Lead save(final @RequestBody Lead lead) {
    	log.info("Saving lead details in the database.");
		return leadRepository.save(lead);
   		
    }
    
    @GetMapping("/lead/getall")
    public List<Lead> getAllLeads(){
		return (List<Lead>) leadRepository.findAll();
    	
    }
    
  
>>>>>>> Stashed changes
    
  
}
