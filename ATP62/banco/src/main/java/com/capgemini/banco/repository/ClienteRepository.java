package com.capgemini.banco.repository;

import com.capgemini.banco.model.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes,Integer>{
  
}
