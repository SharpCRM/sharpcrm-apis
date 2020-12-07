package com.sharp.crm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharp.crm.model.Lead;
import com.sharp.crm.model.TestId;
import com.sharp.crm.repo.LeadsRepository;

@Service
public class LeadService {
   
    
    @Autowired
    LeadsRepository repository;
    
    public List<Lead> getAllLeads(){
        return repository.findAll();
    }
    public Lead saveLead(Lead lead) {
        return repository.save(lead);
    }
    
    public Lead getLeadById(int id) {
        return repository.findById(id).orElse(null);
        
    }
    
    public String deleteLead(int id) {
        repository.deleteById(id);
        return "Deleted Successfully"+id;
    }
    
    public Lead updateLead(Lead updatedLead) {
      //  Lead existingLead=repository.findById(updatedLead.getId()).orElse(null);
        return repository.save(updatedLead);
    }
    
}
