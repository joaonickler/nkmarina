package com.marina.nkmarina.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.marina.nkmarina.domain.Cliente;
import com.marina.nkmarina.repository.ClienteRepository;


public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj =  repo.findById(id);
		
		return obj.orElse(null);
		
		
	}
	
}
