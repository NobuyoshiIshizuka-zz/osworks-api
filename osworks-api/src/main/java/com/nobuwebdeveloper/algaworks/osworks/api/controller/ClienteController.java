package com.nobuwebdeveloper.algaworks.osworks.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nobuwebdeveloper.algaworks.osworks.domain.model.Cliente;
import com.nobuwebdeveloper.algaworks.osworks.domain.repository.ClienteRepository;

@RestController
public class ClienteController {

	
	@Autowired
	private ClienteRepository ClienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		//return ClienteRepository.findAll();
		return ClienteRepository.findAll();
	}
	
	@GetMapping("/clientes/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
		Optional<Cliente> cliente = ClienteRepository.findById(clienteId);
		
		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		
		return ResponseEntity.notFound().build();
	}

}
