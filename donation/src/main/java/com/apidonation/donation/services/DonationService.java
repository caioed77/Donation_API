package com.apidonation.donation.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.apidonation.donation.DTO.DonationDTO;
import com.apidonation.donation.entities.Donation;
import com.apidonation.donation.repository.DonationRepository;


@Service
public class DonationService {

	
	@Autowired
	private DonationRepository donationrepository;
	
	
	@Transactional
	public Page<DonationDTO> findAll(Pageable pageable){
		Page<Donation> list = donationrepository.findAll(pageable);
		Page<DonationDTO> page = list.map(x -> new DonationDTO(x));
		return page;	
	}

	@Transactional
	public DonationDTO findById(Long id) {
		Donation result = donationrepository.findById(id).get();
		DonationDTO dto = new DonationDTO(result);
		return dto;

	
	}
		
	public DonationDTO insert(@RequestBody Donation donation) {
		Donation result = donationrepository.save(donation);
		DonationDTO insertDto = new DonationDTO(result);
		return insertDto;
	
	}
}
