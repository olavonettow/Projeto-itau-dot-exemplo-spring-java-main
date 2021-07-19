package com.olavocorp.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.olavocorp.projeto.model.Conta;
import com.olavocorp.projeto.repo.ContaRepo;

@RestController
public class ContaController {
	
	@Autowired
	private ContaRepo repo;
	
	@GetMapping("/contas")
	public java.util.List<Conta> recuperarTudo(){
		return (java.util.List<Conta>) repo.findAll();
		
	}
	
	@GetMapping("/contas/{numero}")
	public ResponseEntity<Conta> show(@PathVariable int numero){
		var conta = repo.findById(numero).orElse(null);
		return ResponseEntity.ok(conta);
	}

}
