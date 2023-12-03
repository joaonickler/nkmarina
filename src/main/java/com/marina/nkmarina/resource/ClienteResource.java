package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marina.nkmarina.domain.Cliente;
import com.marina.nkmarina.repository.ClienteRepository;


@RestController
@RequestMapping(value = "api/clientes")
public class ClienteResource {

	private ClienteRepository  clienteRepository;
	
	public ClienteResource(ClienteRepository clienteRepository) {
        super();
    	this.clienteRepository = clienteRepository;
    }
	
	@GetMapping	
	@ResponseStatus(code = HttpStatus.CREATED)
	public List<Cliente> lista() {
		return clienteRepository.findAll();       
    }
	
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
    public Cliente UpdateCliente (@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
    }
	
	
	

	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
    public Cliente getClienteById(@PathVariable Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
    }
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
    public Cliente Cliente (@RequestBody Cliente cliente) {
		///cliente.setId_cliente(0);
		for(var umaembarcacao: cliente.getEmbarcacoes()) {
			umaembarcacao.setCliente(cliente);
		}
		return clienteRepository.save(cliente);
    }
	
	
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void deleteCliente(@PathVariable Integer id) {
		 
		clienteRepository.deleteById(id);
	}
	
	
	
	
	
}
