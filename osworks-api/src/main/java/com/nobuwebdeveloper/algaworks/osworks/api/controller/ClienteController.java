package com.nobuwebdeveloper.algaworks.osworks.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nobuwebdeveloper.algaworks.osworks.domain.model.Cliente;
import com.nobuwebdeveloper.algaworks.osworks.domain.repository.ClienteRepository;

@RestController
public class ClienteController {

	
	@Autowired
	private ClienteRepository ClienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return ClienteRepository.findAll();
	}

}
