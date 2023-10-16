package com.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkmarina.domain.Embarcacao;
import com.nkmarina.repository.EmbarcacaoRepository;

@RestController
@RequestMapping(value = "/embarcacao")
public class EmbarcacaoResource {

		
	private EmbarcacaoRepository  embarcacaoRepository;
	
	public EmbarcacaoResource(EmbarcacaoRepository embarcacaoRepository) {
        super();
    	this.embarcacaoRepository = embarcacaoRepository;
    }
    
	
	@GetMapping	
	public List<Embarcacao> lista() {
		return embarcacaoRepository.findAll();       
    }
	
	
	@GetMapping("/{id}")
    public Embarcacao getEmbarcacaoById(@PathVariable Integer id) {
        return embarcacaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Embarcacao não encontrado"));
    }
	
	@PostMapping
    public Embarcacao Embarcacao (@RequestBody Embarcacao embarcacao) {
        return embarcacaoRepository.save(embarcacao);
    }
	
	@DeleteMapping("/{id}")
	public void deleteEmbarcacao(@PathVariable Integer id) {
		embarcacaoRepository.deleteById(id);
	}
		
	
	
}
