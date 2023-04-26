package com.challenge.ecommerce.bitechchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.ecommerce.bitechchallenge.model.DetalleOrden;
import com.challenge.ecommerce.bitechchallenge.repository.IDetalleOrdenRepository;

public class DetalleOrdenServiceImpl implements IDetalleOrdenService {
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.save(detalleOrden);
	}

}
