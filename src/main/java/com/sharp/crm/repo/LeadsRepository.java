package com.sharp.crm.repo;

<<<<<<< Updated upstream
import org.springframework.data.jpa.repository.JpaRepository;
=======
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
>>>>>>> Stashed changes

import com.sharp.crm.model.Lead;


<<<<<<< Updated upstream
public interface LeadsRepository extends JpaRepository<Lead, Integer> {
=======
@Repository
public interface LeadsRepository extends CrudRepository<Lead, Integer> {
    
    List<Lead> getAllLeads();
    
    Lead addNewLead(Lead newLead);
    
>>>>>>> Stashed changes
}
