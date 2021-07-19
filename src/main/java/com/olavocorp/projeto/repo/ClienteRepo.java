package com.olavocorp.projeto.repo;

import org.springframework.data.repository.CrudRepository;

import com.olavocorp.projeto.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Integer>{

	
}
