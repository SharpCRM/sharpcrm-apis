package com.sharp.crm.controller;

<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< Updated upstream
=======
import java.util.ArrayList;
>>>>>>> Stashed changes
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

=======
<<<<<<< Updated upstream
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
<<<<<<< HEAD

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

=======
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> Stashed changes
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Deal;
import com.sharp.crm.model.Lead;
<<<<<<< HEAD

import com.sharp.crm.services.LeadService;
=======
<<<<<<< Updated upstream
import com.sharp.crm.services.LeadService;

//@CrossOrigin(origins = "http://localhost:3000")
=======
import com.sharp.crm.repo.LeadsRepository;
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb

import com.sharp.crm.repo.LeadsRepository;

<<<<<<< HEAD
@RestController
@RequestMapping("/api")
public class LeadController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	LeadService leadService;

	@PostMapping("/addLead")
	public Lead save(@RequestBody Lead lead) {
		log.info("Saving lead details in the database.");
		return leadService.saveLead(lead);

	}

	@GetMapping("/leads")
	public List<Lead> getLeads() {
		return leadService.getAllLeads();
	}
	
	 
    @GetMapping("/lead/{id}") 
    public Lead getLead(@PathVariable int id){
        return leadService.getLeadById(id);
    }

	@PutMapping("/update/{id}")
	public Lead updateLead(@RequestBody Lead lead) {
		return leadService.updateLead(lead);
	}

	@DeleteMapping("/lead/{id}")
	public String deleteProduct(@PathVariable int id) {
		return leadService.deleteLead(id);
	}

	@PostMapping("/convertLead")
	public Deal convertLead(@RequestBody Deal newDeal) {
		log.info("converted lead object to deal successfully");
		return leadService.convertLead(newDeal);

	}
   
=======
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
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
    
   

}
