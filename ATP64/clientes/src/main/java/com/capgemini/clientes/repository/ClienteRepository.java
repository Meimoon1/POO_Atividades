package com.capgemini.clientes.repository;

import com.capgemini.clientes.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
