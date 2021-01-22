package com.sharp.crm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharp.crm.model.Deal;
import com.sharp.crm.repo.DealsRepository;

@Service
public class DealService {

	@Autowired
	DealsRepository dealsRepository;

	public Deal saveDead(Deal deal) {
		return dealsRepository.save(deal);
	}

	public List<Deal> getAllDeals() {
		// TODO Auto-generated method stub
		return dealsRepository.findAll();
	}

	public String deleteDeal(int id) {
		dealsRepository.deleteById(id);
		return "deleted successfully" + id;
	}

}
