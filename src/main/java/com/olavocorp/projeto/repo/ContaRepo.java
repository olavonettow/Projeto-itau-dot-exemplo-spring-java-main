package com.olavocorp.projeto.repo;

import org.springframework.data.repository.CrudRepository;

import com.olavocorp.projeto.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Integer>{

	
}
