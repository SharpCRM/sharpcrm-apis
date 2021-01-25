package com.sharp.crm.repo;

<<<<<<< HEAD

=======
<<<<<<< Updated upstream
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
import org.springframework.data.jpa.repository.JpaRepository;
=======
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
>>>>>>> Stashed changes

import com.sharp.crm.model.Lead;


<<<<<<< HEAD

public interface LeadsRepository extends JpaRepository<Lead, Integer> {



=======
<<<<<<< Updated upstream
public interface LeadsRepository extends JpaRepository<Lead, Integer> {
=======
@Repository
public interface LeadsRepository extends CrudRepository<Lead, Integer> {
    
    List<Lead> getAllLeads();
    
    Lead addNewLead(Lead newLead);
    
>>>>>>> Stashed changes
>>>>>>> 8e48bfe52fd70d7ec449b855a9c244c4782406bb
}
