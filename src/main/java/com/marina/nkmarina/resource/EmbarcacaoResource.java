package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.marina.nkmarina.domain.Embarcacao;
import com.marina.nkmarina.repository.EmbarcacaoRepository;

@RestController
@RequestMapping(value = "api/embarcacoes")
public class EmbarcacaoResource {

	private EmbarcacaoRepository  embarcacaoRepository;
	
	public EmbarcacaoResource(EmbarcacaoRepository embarcacaoRepository) {
        super();
    	this.embarcacaoRepository = embarcacaoRepository;
    }
	
	@GetMapping	
	@ResponseStatus(code = HttpStatus.CREATED)
	public List<Embarcacao> lista() {		
		return embarcacaoRepository.findAll();       
    }
		
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
    public Embarcacao getEmbarcacaoById(@PathVariable Integer id) {
        return embarcacaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Embarcacao não encontrado"));
    }
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
    public Embarcacao Embarcacao (@RequestBody Embarcacao embarcacao) {
        return embarcacaoRepository.save(embarcacao);
		
    }
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void deleteEmbarcacao(@PathVariable Integer id) {
		embarcacaoRepository.deleteById(id);
	}
	
	
	
	
	
}
