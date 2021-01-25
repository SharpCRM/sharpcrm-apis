package com.sharp.crm.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sharp.crm.model.Lead;



public interface LeadsRepository extends JpaRepository<Lead, Integer> {



}
