package com.sharp.crm.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sharp.crm.model.Lead;

public interface LeadsRepository extends MongoRepository<Lead,String>{
    
    List<Lead> getAllLeads();
    
    Lead addNewLead(Lead newLead);
    
}
