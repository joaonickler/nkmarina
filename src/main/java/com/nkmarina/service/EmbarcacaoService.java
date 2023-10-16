package com.nkmarina.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkmarina.domain.Embarcacao;
import com.nkmarina.repository.EmbarcacaoRepository;
import com.nkmarina.service.execption.ObjetcNotFoundExecption;

@Service
public class EmbarcacaoService {
	
	@Autowired
	private EmbarcacaoRepository repo;
	
	public Embarcacao buscar(Integer id){
		Optional<Embarcacao> obj = repo.findById(id);
		
		if (obj == null ) {
			throw new ObjetcNotFoundExecption("Objeto nao encontrado" + id
						+ ",Tipo"+Embarcacao.class.getName());
		} 
		
		return obj.orElse(null);
					
	}
		
	
}




