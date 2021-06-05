package com.example.main.service;

import java.util.List;

import com.example.main.model.Offer;
import com.example.main.model.OfferDTO;

public interface OfferService {

    public List<Offer> getAll();
	
	public Offer getById(int id);
	
	public void saveOrUpdate(Offer offer);
	
	public void delete(int id);
	
	public List<OfferDTO> getAllDTO();
	
}
