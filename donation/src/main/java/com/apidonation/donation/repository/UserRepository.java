package com.apidonation.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidonation.donation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
