package com.sharp.crm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Deal;
import com.sharp.crm.model.Lead;
import com.sharp.crm.services.DealService;

@RestController
@RequestMapping("/api")
public class DealController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DealService dealService;

	@PostMapping("/addDeals")
	public Deal save(@RequestBody Deal deal) {
		log.info("Saving deals details in the database.");
		return dealService.saveDead(deal);

	}

	@GetMapping("/deals")
	public List<Deal> getDeals() {
		return dealService.getAllDeals();

	}

	@DeleteMapping("/deal/{id}")
	public String deleteProduct(@PathVariable int id) {
		return dealService.deleteDeal(id);
	}

}
