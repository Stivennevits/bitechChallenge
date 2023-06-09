package com.challenge.ecommerce.bitechchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.ecommerce.bitechchallenge.model.Orden;
import com.challenge.ecommerce.bitechchallenge.repository.IOrdenRepository;

@Service
public class OrdenServicesImpl implements IOrdenService{
	
	@Autowired
	private IOrdenRepository ordenRepository;
	
	@Override
	public Orden save(Orden orden) {
		
		return ordenRepository.save(orden);
	}

}
