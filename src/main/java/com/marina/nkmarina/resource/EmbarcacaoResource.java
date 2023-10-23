package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marina.nkmarina.domain.Embarcacao;
import com.marina.nkmarina.repository.EmbarcacaoRepository;

@RestController
@RequestMapping(value = "/embarcacoes")
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
	
	
}
