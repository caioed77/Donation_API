package com.apidonation.donation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.apidonation.donation.entities.enums.DonationStatus;

@Entity
@Table(name = "tb_donation")
public class Donation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tittle;
	private String location;
	private Double amount;
	private String image;
	
	private Integer donationStatus;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Donation() {
		
	}
	
	
	public Donation(Long id, String tittle, String location, Double amount, String image, User user, DonationStatus donationStatus) {
		this.id = id;
		this.tittle = tittle;
		this.location = location;
		this.amount = amount;
		this.image = image;
		this.user = user;
		setDonationStatus(donationStatus);
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public DonationStatus getDonationStatus() {
		return DonationStatus.valueof(donationStatus);
	}


	public void setDonationStatus(DonationStatus donationStatus) {
		if (donationStatus != null ) {
		   this.donationStatus = donationStatus.getCode();
		}
		
	}
		
	
}	
