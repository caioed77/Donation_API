package com.apidonation.donation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidonation.donation.DTO.DonationDTO;
import com.apidonation.donation.entities.Donation;
import com.apidonation.donation.services.DonationService;


@RestController
@RequestMapping(value = "/donation")
public class DonationController {

	
	@Autowired
	private DonationService donationservice;
	
	
	@GetMapping
	public Page<DonationDTO> findAll(Pageable pageable) {
		return donationservice.findAll(pageable);
	
	}
	
	@GetMapping(value = "/{id}")
	public DonationDTO findById(@PathVariable Long id) {
		return donationservice.findById(id);
	}
	
	@PutMapping
	public DonationDTO newDonation(@RequestBody Donation donation) {
		DonationDTO result = donationservice.insert(donation);
		return result;
	}
	
}
