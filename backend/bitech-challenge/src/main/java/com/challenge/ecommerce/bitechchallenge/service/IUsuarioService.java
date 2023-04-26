package com.challenge.ecommerce.bitechchallenge.service;

import java.util.Optional;

import com.challenge.ecommerce.bitechchallenge.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario>findById(Integer id);
}
