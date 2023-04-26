package com.challenge.ecommerce.bitechchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.ecommerce.bitechchallenge.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer >{

}
