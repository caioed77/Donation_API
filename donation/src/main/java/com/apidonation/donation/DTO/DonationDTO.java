package com.apidonation.donation.DTO;

import com.apidonation.donation.entities.Donation;

public class DonationDTO {

	private Long id;
	private String tittle;
	private String location;
	private Double amount;
	
	public DonationDTO() {
		
	}

	public DonationDTO(Long id, String tittle, String location, Double amount) {
		this.id = id;
		this.tittle = tittle;
		this.location = location;
		this.amount = amount;
	}
	
	
	public DonationDTO(Donation donation) {
		id = donation.getId();
		tittle = donation.getTittle();
		location = donation.getLocation();
		amount = donation.getAmount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
