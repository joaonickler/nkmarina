package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	

	@GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
    }
	
	@PostMapping
    public Cliente Cliente (@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Integer id) {
		clienteRepository.deleteById(id);
	}
	
	
	
	
	
}
