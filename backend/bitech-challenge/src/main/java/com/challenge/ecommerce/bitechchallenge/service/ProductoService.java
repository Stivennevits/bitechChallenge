package com.challenge.ecommerce.bitechchallenge.service;

import java.util.List;
import java.util.Optional;

import com.challenge.ecommerce.bitechchallenge.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();
}
