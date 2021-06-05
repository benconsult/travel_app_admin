package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

}
