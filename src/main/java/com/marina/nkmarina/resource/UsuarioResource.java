package com.marina.nkmarina.resource;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.marina.nkmarina.domain.Usuario;
import com.marina.nkmarina.repository.UsuarioRepository;


@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioResource {

	private UsuarioRepository  usuarioRepository;
	
	public UsuarioResource(UsuarioRepository agendaRepository) {
        super();
    	this.usuarioRepository = agendaRepository;
    }
	
	@GetMapping	
	public List<Usuario> lista() {		
		return usuarioRepository.findAll();        
		
    }
		
	
	@GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
    }
	
	@PostMapping
    public Usuario Usuario (@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
	
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	
	
	
}