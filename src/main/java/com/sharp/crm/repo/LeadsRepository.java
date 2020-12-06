package com.sharp.crm.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sharp.crm.model.Lead;


@Repository
public interface LeadsRepository extends CrudRepository<Lead, Integer> {
    
    List<Lead> getAllLeads();
    
    Lead addNewLead(Lead newLead);
    
}
