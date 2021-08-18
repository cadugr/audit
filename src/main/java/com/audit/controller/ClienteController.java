package com.audit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audit.model.Cliente;
import com.audit.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente cadastrar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
