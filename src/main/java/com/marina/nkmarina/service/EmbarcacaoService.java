package com.marina.nkmarina.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.marina.nkmarina.domain.Embarcacao;
import com.marina.nkmarina.repository.EmbarcacaoRepository;

public class EmbarcacaoService {

	@Autowired
	private EmbarcacaoRepository repo;
	
	
	public Embarcacao buscar(Integer id) {
		
		Optional<Embarcacao> obj =  repo.findById(id);
		
		return obj.orElse(null);
		
		
	}
	
}
