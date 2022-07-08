package com.apidonation.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidonation.donation.entities.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

}
