package com.sharp.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

import com.sharp.crm.model.Deal;
import com.sharp.crm.model.Lead;

public interface DealsRepository extends JpaRepository<Deal, Integer> {

}
