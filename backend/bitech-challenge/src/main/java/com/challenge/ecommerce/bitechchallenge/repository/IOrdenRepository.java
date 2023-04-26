package com.challenge.ecommerce.bitechchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.ecommerce.bitechchallenge.model.Orden;

public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

}
