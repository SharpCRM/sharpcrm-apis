package com.sharp.crm.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Deal;
import com.sharp.crm.model.Lead;

import com.sharp.crm.services.LeadService;

import com.sharp.crm.repo.LeadsRepository;

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
   
    
   

}
