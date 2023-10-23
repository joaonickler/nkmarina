package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marina.nkmarina.domain.Cliente;
import com.marina.nkmarina.repository.ClienteRepository;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	private ClienteRepository  clienteRepository;
	
	public ClienteResource(ClienteRepository clienteRepository) {
        super();
    	this.clienteRepository = clienteRepository;
    }
	
	@GetMapping	
	public List<Cliente> lista() {
		return clienteRepository.findAll();       
    }
	
	
}
